class DessinFractale{
    private final Turtle bob;
    
    private final static int LARGEUR = 800;
    private final static int HAUTEUR = 600;
    //taille de la fenetre graphique

    public DessinFractale(){
	bob  = new Turtle();
	Turtle.setCanvasSize(LARGEUR,HAUTEUR);//à appeler APRES création de la tortue
    }

    public DessinFractale(int v){
	//attention, plus v est grand, plus bob va lentement !
	this();
	bob.speed(v);
	//bob.left(90);
    }


    public void reset(){
	bob.clear();
	bob.up();
	bob.setPosition(0,0);
	bob.setDirection(0);
	bob.down();

    }

    public void close(){
	bob.exit();
    }


    public void carre(double l)	{
    	bob.forward(l);
    	bob.right(90);
		bob.forward(l);
		bob.right(90);
		bob.forward(l);
		bob.right(90);
		bob.forward(l);
		bob.right(90);
    }

    public void vonKoch(double l,int n){
    	if (n==0){
    		bob.forward(l);
		}
    	else {
    		vonKoch(l/3,n-1);
    		bob.left(60);
    		vonKoch(l/3,n-1);
    		bob.right(120);
    		vonKoch(l/3,n-1);
    		bob.left(60);
    		vonKoch(l/3,n-1);
		}
	}

	public void arbre(double l, int n){
    	if(n==0){
    		bob.forward(l);
			bob.forward(-l);
		}
		else{
			bob.forward(l * 2 / 3);
			bob.left(45);
			arbre(l / 3, n - 1);
			bob.right(45);
			arbre(l/3,n-1);
			bob.right(45);
			arbre(l/3,n-1);
			bob.left(45);
			bob.forward(-l*2/3);
		}
	}

	public void triforce(double l, int n){
    	if(n==0){
    		bob.forward(l);
    		bob.left(120);
			bob.forward(l);
			bob.left(120);
			bob.forward(l);
			bob.left(120);
		}
    	else{
    		triforce(l/2,n-1);
    		bob.forward(l/2);
    		triforce(l/2,n-1);
    		bob.left(120);
    		bob.forward(l/2);
    		bob.right(120);
    		triforce(l/2,n-1);
    		bob.right(120);
    		bob.forward(l/2);
    		bob.left(120);
		}
	}

	public void dragonAux(double l, int n, int virage){
    	if(n==0){
    		bob.forward(l);
		}
    	else {
    		dragonAux(l,n-1,0);
    		if(virage==0) {
				bob.left(90);
			}
    		else{
    			bob.right(90);
			}
    		dragonAux(l,n-1,1);
		}
	}

	public void dragon(double l, int n){
    	dragonAux(l,n,0);
	}

    public static void main(String[] args){
	DessinFractale d = new DessinFractale(1);

	d.dragon(100,20);

	/*d.carre(90);
	d.reset();
	d.carre(60);
	d.reset();
	d.close();*/
    }
    
}