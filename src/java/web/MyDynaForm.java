package web;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.validator.LazyValidatorForm;

/**
 *
 * @author DickD
 */
public class MyDynaForm extends LazyDynaBean
{
  //@Override
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
//    if (getName() == null || getName().length() < 1)
//    {
//      errors.add("name", new ActionMessage("error.name.required"));
//      // TODO: add 'error.name.required' key to your resources
//    }
    System.out.println("Validation called");
    return errors;
  }
}
