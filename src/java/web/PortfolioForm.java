/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author DickD
 */
public class PortfolioForm extends org.apache.struts.action.ActionForm
{
  private String[] name;
  private int number;

  /**
   * @return
   */
  public String getName(int i)
  {
    return name[i];
  }

  /**
   * @param string
   */
  public void setName(int index, String string)
  {
    name[index] = string;
  }

  public String[] getName()
  {
    return name;
  }

  public void setName(String[] name)
  {
    this.name = name;
  }

  /**
   * @return
   */
  public int getNumber()
  {
    return number;
  }

  /**
   * @param i
   */
  public void setNumber(int i)
  {
    number = i;
  }

  /**
   *
   */
  public PortfolioForm()
  {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * This is the action called from the Struts framework.
   *
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   *
   * @return
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    ActionErrors errors = new ActionErrors();
//    if (getName() == null || getName().length() < 1)
//    {
//      errors.add("name", new ActionMessage("error.name.required"));
//      // TODO: add 'error.name.required' key to your resources
//    }
    return errors;
  }
}
