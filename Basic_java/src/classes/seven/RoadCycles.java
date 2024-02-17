package classes.seven;

public class RoadCycles extends Bicycle {

private int tyrewidth;

public RoadCycles() {
	
}

public RoadCycles(int gears, String brand, int tw) {
	super(gears, brand);
	this.tyrewidth=tw;
}



public int getTyrewidth() {
    return tyrewidth;
}

public void setTyrewidth(int tyrewidth) {
    this.tyrewidth = tyrewidth;
}
}