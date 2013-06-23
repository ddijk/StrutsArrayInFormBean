package web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.LazyValidatorForm;

/**
 *
 * @author DickD
 */
public class MyDynaForm extends LazyValidatorForm
{
  //@Override
  @Override
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {

    ActionErrors errors = super.validate(mapping, request);
//    if (getName() == null || getName().length() < 1)
//    {
//      errors.add("name", new ActionMessage("error.name.required"));
//      // TODO: add 'error.name.required' key to your resources
//    }
    System.out.println("Validation called");
    List<String> names = (List<String>) get("name");
    for (String n : names)
    {
      System.out.println("Validating " + n);

    }
    System.out.println("Validating number, value is " + get("number"));

    return errors;
  }
}
