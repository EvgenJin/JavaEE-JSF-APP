package evg.login.Controller;

import evg.login.Entity.Todos;
import evg.login.Controller.util.JsfUtil;
import evg.login.Controller.util.JsfUtil.PersistAction;
import evg.login.SessionBean.TodosFacade;
import static evg.login.Util.SessionUtils.getUserName;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("todosController")
@SessionScoped
public class TodosController implements Serializable {

    @EJB
    private TodosFacade ejbFacade;
    private List<Todos> items = null;
    private Todos selected;

    public TodosController() {
    }

    public Todos getSelected() {
//        selected.setUsr(getUserName());
        return selected;
    }

    public void setSelected(Todos selected) {
//        selected.setUsr("asdasd");
//        this.selected.setUsr(getUserName());
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TodosFacade getFacade() {
        return ejbFacade;
    }

    public Todos prepareCreate() {
        selected = new Todos();
        selected.setUsr(getUserName());
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        System.out.println(getUserName());
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TodosCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TodosUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TodosDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Todos> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Todos getTodos(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Todos> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Todos> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Todos.class)
    public static class TodosControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TodosController controller = (TodosController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "todosController");
            return controller.getTodos(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Todos) {
                Todos o = (Todos) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Todos.class.getName()});
                return null;
            }
        }

    }

}
