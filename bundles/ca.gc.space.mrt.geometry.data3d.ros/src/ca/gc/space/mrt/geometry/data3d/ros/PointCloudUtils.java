package ca.gc.space.mrt.geometry.data3d.ros;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates;

public class PointCloudUtils
{
	/**
	 * Function to convert a ros point cloud to a cartesian coordinates set
	 * @param The ros point cloud
	 * @return The converted CartesianCoordinatesSet
	 */
	public static CartesianCoordinatesSet rosPointCloudToCartesianCoordinateSet ( sensor_msgs.PointCloud2 pc )
	{
		CartesianCoordinatesSet coordinates = Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		int count = pc.getData().capacity() / pc.getPointStep();
		ByteBuffer bb = ByteBuffer.wrap(pc.getData().array());
		bb.order(pc.getData().order());
		bb.position(pc.getData().arrayOffset());
		
		boolean color = (pc.getFields().size() > 3);
		
		for ( int i = 0; i < count; i ++ )
		{
			CartesianPositionCoordinates coord;
			if ( color )
				coord = readRGBCartesianPositionCoordinates(bb);
			else
				coord = readCartesianPositionCoordinates(bb);
			
			points.add(coord);
		}

		coordinates.getPoints().addAll(points);
		
		return coordinates;
	}
	
	/**
	 * Reads a color coordinate in a byte buffer
	 * @param bb
	 * @return
	 */
	private static RGBCartesianPositionCoordinates readRGBCartesianPositionCoordinates ( ByteBuffer bb )
	{
		RGBCartesianPositionCoordinates coord =  Data3dFactory.eINSTANCE.createRGBCartesianPositionCoordinates();
		coord.setX(bb.getFloat());
		coord.setY(bb.getFloat());
		coord.setZ(bb.getFloat());
		bb.getFloat(); //Skip 4 bytes

		long rgb = bb.getLong();
		coord.setRed((byte)(rgb >> 16 & 0x0000ff));
		coord.setGreen((byte)(rgb >> 8 & 0x0000ff));
		coord.setBlue((byte)(rgb & 0x0000ff));		
		bb.getLong(); //Skip 8 bytes
		
		return coord;
	}
	
	/**
	 * Reads a coordinate in a byte buffer
	 * @param bb
	 * @return
	 */
	private static CartesianPositionCoordinates readCartesianPositionCoordinates ( ByteBuffer bb )
	{
		CartesianPositionCoordinates coord = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(bb.getFloat(), bb.getFloat(), bb.getFloat());
		bb.getFloat();
		
		return coord;
	}
	
	/**
	 * Function to convert a cartesian coordinates set to a ros point cloud
	 * @param map The CartesianCoordinatesSet
	 * @param node The ros node
	 * @return The converted PointCloud
	 */
	public static sensor_msgs.PointCloud2 cartesianCoordinateSetToRosPointCloud ( CartesianCoordinatesSet map, RosNode node )
	{
		sensor_msgs.PointCloud2 pc = node.newFromType(sensor_msgs.PointCloud2._TYPE);
		
		sensor_msgs.PointField pfx = node.newFromType(sensor_msgs.PointField._TYPE);
		pfx.setName("x");
		pfx.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfx.setCount(1);
		
		sensor_msgs.PointField pfy = node.newFromType(sensor_msgs.PointField._TYPE);
		pfy.setName("y");
		pfy.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfy.setOffset(4);
		pfy.setCount(1);
		
		sensor_msgs.PointField pfz = node.newFromType(sensor_msgs.PointField._TYPE);
		pfz.setName("z");
		pfz.setDatatype(sensor_msgs.PointField.FLOAT32);
		pfz.setOffset(8);
		pfz.setCount(1);
		
		pc.getFields().add(pfx);
		pc.getFields().add(pfy);
		pc.getFields().add(pfz);
		
		pc.setHeight(1);
		pc.setWidth(map.getPoints().size());
		pc.setIsBigendian(false);
		pc.setIsDense(true);
		pc.setPointStep(16);
		pc.setRowStep(map.getPoints().size() * 16);
		
		
		ChannelBuffer data = ChannelBuffers.buffer(ByteOrder.LITTLE_ENDIAN, map.getPoints().size() * 16);
		
		for ( CartesianPositionCoordinates pt : map.getPoints())
		{
			data.writeFloat((float)pt.getX());
			data.writeFloat((float)pt.getY());
			data.writeFloat((float)pt.getZ());
			data.writeFloat(1.0f);
		}
		
		pc.setData(data);
		
		return pc;
	}
	
	/**
	 * Function to save a point cloud viewed from above to a 2d png image 
	 * @param map
	 * @param path
	 */
	public static void save2DMap ( CartesianCoordinatesSet map, String path )
	{
		double minX = Double.MAX_VALUE;
		double maxX = 0;
		double minY = Double.MAX_VALUE;
		double maxY = 0;
		double minZ = Double.MAX_VALUE;
		double maxZ = 0;
		
		for ( CartesianPositionCoordinates p : map.getPoints() )
		{
			if ( p.getX() > maxX )
				maxX = p.getX();
			if ( p.getX() < minX )
				minX = p.getX();
			if ( p.getY() > maxY )
				maxY = p.getY();
			if ( p.getY() < minY )
				minY = p.getY();
			if ( p.getZ() > maxZ )
				maxZ = p.getZ();
			if ( p.getZ() < minZ )
				minZ = p.getZ();
		}
		
		double width = maxX - minX + 1;
		double height = maxY - minY + 1;
		double depth = maxZ - minZ;
		int pWidth = (int)Math.ceil(width * 100);
		int pHeight = (int)Math.ceil(height * 100);
		
		BufferedImage img = new BufferedImage(pWidth, pHeight, BufferedImage.TYPE_INT_RGB);

		for ( CartesianPositionCoordinates p : map.getPoints() )
		{
			int x = (int)Math.floor((p.getX() - minX ) * 100);
			int y = pHeight - 1 - (int)Math.round((p.getY() - minY ) * 100);	
			double percent = ( p.getZ() - minZ ) / depth; 
			int val = (int)(percent * 255);
			
			if ( p instanceof RGBCartesianPositionCoordinates )
			{
				RGBCartesianPositionCoordinates prgb = (RGBCartesianPositionCoordinates)p;
				val = new Color(prgb.getRed() & 0xFF, prgb.getGreen() & 0xFF, prgb.getBlue() & 0xFF).getRGB();
			}
			
			if ( val > img.getRGB(x, y))
				img.setRGB(x, y, val);
		}
		
		try
		{
			File outputfile = new File(path);
			ImageIO.write(img, "png", outputfile);
		} 
		catch (IOException e){}

	}
	
	/**
	 * Function to save a point cloud to a file
	 * @param map
	 * @param path
	 */
	public static void savePointCloudToFile ( CartesianCoordinatesSet map, String path )
	{		
		try
		{
			FileWriter outFile = new FileWriter(path);
			PrintWriter out = new PrintWriter(outFile);

			for (CartesianPositionCoordinates pos : map.getPoints())
				out.println(pos.getX() + " " + pos.getY() + " " + pos.getZ());
			
			out.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
