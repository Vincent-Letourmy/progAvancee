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

	/*public void dragon(double l, int n, int gauche){
    	if(n==0){
    		bob.forward(l);
		}
    	else if(n==1){
    		dragon(l,n-1,gauche);
    		if(gauche==0) {
				bob.left(90);
			}
    		else{
    			bob.right(90);
			}
    		dragon(l,n-1,gauche);
		}
    	else if(n==2) {
				dragon(l, n - 1,0);
				bob.left(90);
				dragon(l, n - 2);
				bob.right(90);
				dragon(l, n - 2);
		}
	}*/

    public static void main(String[] args){
	DessinFractale d = new DessinFractale(150);

	//d.dragon(100,1,0);

	/*d.carre(90);
	d.reset();
	d.carre(60);
	d.reset();
	d.close();*/
    }
    
}