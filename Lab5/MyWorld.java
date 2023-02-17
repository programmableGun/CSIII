import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	//private Dog5 dog;
    //private Jack5 jack;
    //In the MyWorld class, create a private instance variable called tiles that is a 2D array of Strings.
    private String[][] tiles;
    public MyWorld() 
    {
    	setBackground("Lab4/img/BG/BG.png");
        //In the constructor of MyWorld, instantiate the tiles 2D array with 6 rows and 8 columns.
    	tiles = new String[6][8];
        initateStringArray();
        //Make sure to call these methods from the constructor!
        buildWorld();
        addRandomObject();
        
        addMainCharacter();
    	// addObject(cat, 100, 100);
        // dog = new Dog5();
    	// addObject(dog, 100, 150);
        // jack = new Jack5();
    	// addObject(jack, 100, 200);
    }
    public void addMainCharacter(){
        //Instantiate the cat:
        cat = new Cat();
        cat.scale(200,200);
        boolean added = false;
        //Let’s randomly choose a row and randomly choose a column to place the cat:
        int row = (int) (Math.random()*tiles.length);
        int col = (int) (Math.random()*tiles[0].length);
        //Add the cat object at that row and column:
        
        while(!added){
            // minus 1 because we know that the last array is filled with ground
            row = (int) (Math.random()*(tiles.length-1));
            col = (int) (Math.random()*tiles[0].length);
            if(!tiles[row][col].equals("yarn")){
                added = true;
                System.out.println("adding cat @ "+row+", "+col);
                addObject(cat, col*100, row*100);
                tiles[row][col] = "cat";
            }
        }

    }
    //Create a new method named buildWorld() in the MyWorld class that fills the tiles object with empty strings.
    public void buildWorld(){
        //In the buildWorld() method, add another for loop.
        for(int i = 0; i < tiles[5].length; i++){
            //This for loop will add the string “ground” to all the columns for row 5 in the tiles 2D array.
            tiles[5][i] = "ground";
        }
        /*Create another for loop (HINT: double for loop) that looks at every cell in the tiles 2D array. If the item is
“ground”, then call addObject: */
        for(int i = 0; i < tiles.length;i++){
            for(int j = 0; j < tiles[i].length;j++){
                if(tiles[i][j].equals("ground")){
                    addObject(new Block(), j*128, (600-128));
                }
            }
        }
    }
    //In the MyWorld class, create a new method called addRandomObjects().
    public void addRandomObject(){
        for(int i = 0; i < tiles.length-2; i++){
            for(int j = 0; j < tiles[i].length; j++){
                int selector = (int)(Math.random()*10); 
                System.out.println("Selector = "+selector);
                if(selector < 3){
                    addObject(new Yarn5(), j*100, i*100);
                    tiles[i][j] = "yarn";
                }

            }
        }
    }
    public void initateStringArray(){
        for (int i = 0; i < tiles.length; i++){
            for (int j = 0; j < tiles[i].length; j++){
                //this should get rid of nullPointerExecption err
                tiles[i][j] = "";
            }
        }
    }
    public void act()
    {
    }
    
}