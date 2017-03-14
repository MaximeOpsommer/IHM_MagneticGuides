package main;

import java.awt.BasicStroke;
import java.awt.geom.Point2D;

import fr.lri.swingstates.canvas.CExtensionalTag;
import fr.lri.swingstates.canvas.CSegment;
import fr.lri.swingstates.canvas.Canvas;

public class MagneticGuide extends CExtensionalTag {
	
	private CSegment cseg;
	private CExtensionalTag theTag;
	private String type;
	

	public MagneticGuide(Canvas canvas, Point2D p, String type) {
		this.canvas = canvas;
		this.cseg = this.canvas.newSegment(- canvas.getMaxX()*2, (int) p.getY(), canvas.getMaxX()*2, (int) p.getY());
		this.cseg.setStroke(new BasicStroke(5));
		this.cseg.belowAll();
		this.cseg.addTag(this);
		this.theTag = this;
		this.cseg.addTo(canvas);
		this.type = type;
	}
	
	public CSegment getSeg(){
		return this.cseg;
	}

	public CExtensionalTag getTag(){
		return this.theTag;
	}
	
	public String getType(){
		return this.type;
	}
}
