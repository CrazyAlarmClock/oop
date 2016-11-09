
public class Box {
	double height;
    double depth;
	double width;
 private static 	String me = "mega box!!";
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
    
    
     
		Box(double w, double h, double d){
    	 this.width=w;
    	 this.height=h;
    	 this.depth= d;
    	 
		}
    
		 
		 Box(){
			 this (-1,-1,-1);
		 }
		 
		 Box(double quad){
			 
			  this.depth=this.height=this.width=quad;
		 }
		 
		 
		double volume(){
    	  return this.depth*this.height*this.width; 
     }
		
}
