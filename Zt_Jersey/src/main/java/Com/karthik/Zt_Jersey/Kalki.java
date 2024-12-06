package Com.karthik.Zt_Jersey;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="kalki")
public class Kalki {

	private String name;
	private int points ;
	 @XmlElement(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 @XmlElement(name="points")
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	

}
