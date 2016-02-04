package ca.gc.asc_csa.apogy.addons.ros.imaging.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.awt.Point;
import java.awt.Transparency;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferUShort;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import ca.gc.asc_csa.apogy.addons.ros.imaging.Activator;
import ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade;
import ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingPackage;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsROSImagingFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsROSImagingFacade
{
	private static ApogyAddonsROSImagingFacade instance;

	public static ApogyAddonsROSImagingFacade getInstance()
	{
		if(instance == null)
		{
			instance = new ApogyAddonsROSImagingFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsROSImagingFacadeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsROSImagingPackage.Literals.APOGY_ADDONS_ROS_IMAGING_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public EImage convertToEImage(Image rosImage)
	{
		EImage eImage = null;
		int width = rosImage.getWidth();
		int height = rosImage.getHeight();

		PixelInterleavedSampleModel sampleModel = null;
		ColorSpace cs = null;
		ColorModel colourModel = null;

		String endianType = null;
		
		if(rosImage.getIsBigendian() == 1)
		{
			endianType = "Big Endian";
		}
		else
		{
			endianType = "Little Endian";
		}

		Logger.INSTANCE.log(Activator.ID, this, "convertToEImage() : Image encoding <" + rosImage.getEncoding() + "> and byte order is <" + endianType + ">. Raw data size is <" + rosImage.getData().array().length + "> bytes.", EventSeverity.INFO);

		if(rosImage.getEncoding().compareToIgnoreCase("mono8") == 0)
		{
			DataBufferByte dataBuffer = new DataBufferByte(rosImage.getData().array(), rosImage.getData().array().length);

			sampleModel = new PixelInterleavedSampleModel(DataBuffer.TYPE_BYTE, width, height, 1, width, new int[] {0});
			cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
			colourModel = new ComponentColorModel(cs, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);

			WritableRaster raster = Raster.createWritableRaster(sampleModel, dataBuffer, new Point(0,0));
			BufferedImage bufferedImage = new BufferedImage(colourModel, raster, false, null);

			eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			eImage.setImageContent(bufferedImage);
			return eImage;
		}
		else if (rosImage.getEncoding().compareToIgnoreCase("mono16") == 0) 
		{
			try 
			{
				byte[] data = new byte[width * height*2];
				System.arraycopy(rosImage.getData().array(), rosImage.getData().arrayOffset(), data, 0, data.length);

				System.out.println(" w " + width + " h " + height + " offest " + rosImage.getData().arrayOffset());

				ByteArrayInputStream byteInputStream = new ByteArrayInputStream(data);
				DataInputStream dis = new DataInputStream(byteInputStream);
				short[] shortPixels = new short[width * height];

				System.out.println("Length: " + shortPixels.length);


				int i = 0;
				while (true) 
				{
					if (byteInputStream.available() > 0 && i < shortPixels.length) 
					{
						int gray16Value = 0;

						int msb = dis.readUnsignedByte();
						int lsb = dis.readUnsignedByte();

						gray16Value = ((lsb & 0x0000FFFF) << 8)	| (msb & 0x0000FFFF);
						shortPixels[i] = (short) gray16Value;
						i++;
					}
					else 
					{
						break;
					}
				}
				dis.close();

				System.out.println("i: " + i + "/" + (width * height));

				ColorModel model = new ComponentColorModel(ColorSpace.getInstance(ColorSpace.CS_GRAY),new int[] { 16 }, false, true, Transparency.OPAQUE,DataBuffer.TYPE_USHORT);

				DataBufferUShort db = new DataBufferUShort(shortPixels, width* height);
				ComponentSampleModel csm = new ComponentSampleModel(DataBuffer.TYPE_USHORT, width, height, 1, width, new int[] { 0 });
				WritableRaster raster = WritableRaster.createWritableRaster(csm, db, null);

				BufferedImage image = new BufferedImage(model, raster, false, null);
				eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
				eImage.setImageContent(image);
			} 
			catch (Throwable t) 
			{
				t.printStackTrace();
			}
		}
		else
		{
			DataBufferByte dataBuffer = new DataBufferByte(rosImage.getData().array(), rosImage.getData().array().length);

			sampleModel = new PixelInterleavedSampleModel(DataBuffer.TYPE_BYTE, width, height, 3, 3*width, new int[] {2,1,0});        
			cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			colourModel = new ComponentColorModel(cs, false, false, Transparency.OPAQUE, DataBuffer.TYPE_BYTE);

			WritableRaster raster = Raster.createWritableRaster(sampleModel, dataBuffer, new Point(0,0));
			BufferedImage bufferedImage = new BufferedImage(colourModel, raster, false, null);

			eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			eImage.setImageContent(bufferedImage);

		}

		return eImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public EImage convertToEImage(CompressedImage compressedImage)
	{
		EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();

		int offset = compressedImage.getData().arrayOffset();
		byte[] buffer = compressedImage.getData().array();

		// Stream to read the image data. We need to skip the message header and to start reading at the "offset" position.
		ByteArrayInputStream stream = new ByteArrayInputStream(buffer, offset, buffer.length - offset);			
		ImageData imageData = new ImageData(stream);

		eImage.setImageContent(EImagesUtilities.INSTANCE.convertToBufferedImage(imageData));
		return eImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public CompressedImage convertToCompressedImage(EImage eImage, ConnectedNode connectedNode)
	{
		ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(eImage.getImageContent());
		return convertToCompressedImage(imageData, connectedNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public CompressedImage convertToCompressedImage(ImageData imageData, ConnectedNode connectedNode)
	{
		CompressedImage image = connectedNode.getTopicMessageFactory().newFromType(CompressedImage._TYPE);
		image.setFormat("jpeg");		

		try
		{
			ByteArrayOutputStream stream = new ByteArrayOutputStream();		    
			ImageLoader imageLoader = new  ImageLoader();
			imageLoader.data = new ImageData[] {imageData};
			imageLoader.save(stream, SWT.IMAGE_JPEG);		

			byte[] data = stream.toByteArray();
			ChannelBuffer buffer = ChannelBuffers.buffer(ChannelBuffers.LITTLE_ENDIAN, data.length);
			buffer.writeBytes(data);

			image.setData(buffer);				
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case ApogyAddonsROSImagingPackage.APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__IMAGE:
				return convertToEImage((Image)arguments.get(0));
			case ApogyAddonsROSImagingPackage.APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE:
				return convertToEImage((CompressedImage)arguments.get(0));
			case ApogyAddonsROSImagingPackage.APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE:
				return convertToCompressedImage((EImage)arguments.get(0), (ConnectedNode)arguments.get(1));
			case ApogyAddonsROSImagingPackage.APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE:
				return convertToCompressedImage((ImageData)arguments.get(0), (ConnectedNode)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyAddonsROSImagingFacadeImpl
