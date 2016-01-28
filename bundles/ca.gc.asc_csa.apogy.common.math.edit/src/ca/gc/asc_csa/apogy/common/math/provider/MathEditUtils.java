package ca.gc.asc_csa.apogy.common.math.provider;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.MathUtils;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

public class MathEditUtils
{
	/** 
	 * Contains only static members.
	 */
	private MathEditUtils()
	{
		
	}
	
	/**
	 * Updates the orientation of the matrix.  If the editingDomain is null then {@link MathUtils#updateOrientation(Matrix4x4, Matrix3x3)
	 * is used.
	 * @param matrix Matrix to be updated
	 * @param orientation Orientation matrix.
	 * @param editingDomain Editing Domain.
	 */	
	public static void updateOrientation(Matrix4x4 matrix, Matrix3x3 orientation, EditingDomain editingDomain)
	{
		if (editingDomain == null)
		{
			MathUtils.updateOrientation(matrix, orientation);
		}
		else
		{
			CompoundCommand command = new CompoundCommand();			
			
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M00, orientation.getM00()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M01, orientation.getM01()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M02, orientation.getM02()));
			
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M10, orientation.getM10()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M11, orientation.getM11()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M12, orientation.getM12()));

			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M20, orientation.getM20()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M21, orientation.getM21()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX4X4__M22, orientation.getM22()));
			
			editingDomain.getCommandStack().execute(command);										
		}
	}
	
	public static void updateOrientation(Matrix3x3 matrix, Matrix3x3 orientation, EditingDomain editingDomain)
	{
		if (editingDomain == null)
		{
			MathUtils.updateOrientation(matrix, orientation);
		}
		else
		{
			CompoundCommand command = new CompoundCommand();			
			
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M00, orientation.getM00()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M01, orientation.getM01()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M02, orientation.getM02()));
			
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M10, orientation.getM10()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M11, orientation.getM11()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M12, orientation.getM12()));

			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M20, orientation.getM20()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M21, orientation.getM21()));
			command.append(SetCommand.create(editingDomain, matrix, ApogyCommonMathPackage.Literals.MATRIX3X3__M22, orientation.getM22()));
			
			editingDomain.getCommandStack().execute(command);										
		}
	}
}
