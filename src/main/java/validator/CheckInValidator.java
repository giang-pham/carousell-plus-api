package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import model.carousell.CarousellConstant;
import model.carousell.CarousellConstant.constantList;

public class CheckInValidator implements ConstraintValidator<CheckIn, String> {

	private constantList objectList;

	public void initialize(CheckIn constraintAnnotation) {
		this.objectList = constraintAnnotation.value();
	}

	public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

		if (object == null)
			return false;

		if (objectList == constantList.category)
			return CarousellConstant.categoryList.contains(object);
		else
			return false;
	}
}
