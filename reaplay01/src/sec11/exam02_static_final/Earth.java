package sec11.exam02_static_final;

public class Earth {
	//상수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//static block
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	//메소드

}
