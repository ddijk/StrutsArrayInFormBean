package web;

import org.apache.struts.validator.ValidatorForm;

/**
 *
 * @author DickD
 */
public class PortfolioValidatorForm extends ValidatorForm
{
  int number;

  public int getNumber()
  {
    return number;
  }

  public void setNumber(int number)
  {
    this.number = number;
  }
}
