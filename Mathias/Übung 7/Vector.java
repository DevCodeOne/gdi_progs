public class Vector{
	double[] vec = new double[2];
	
	public Vector(double a, double b){
		vec[0] = a;
		vec[1] = b;
	}
	
	public Vector mult(double n){
		vec[0] *= n;
		vec[1] *= n;
		return this;
	}
	
	public Vector add(Vector v){
		vec[0] += v.vec[0];
		vec[1] += v.vec[1];
		return this;
	}
	
	public double mult(Vector v){		
		return (vec[0] * v.vec[0] + vec[1] * v.vec[1]);
	}

	public double abs(){
		return Math.sqrt(mult(this));
	}
	
	public String toString(){
		
		return (vec[0] + " " + vec[1]);
	}
		
}