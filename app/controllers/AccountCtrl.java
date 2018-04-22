package controllers;

import controllers.security.*;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import views.html.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


import models.users.*;

public class AccountCtrl extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public AccountCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
        }



        @Transactional
    public Result addUser() {
        Form<User> addUserForm = formFactory.form(User.class);
        return ok(addUser.render(addUserForm, getCurrentUser()));
    }

    private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}


    @Transactional
    public Result addUserSubmit() {
        User newUser;
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();

        if (newUserForm.hasErrors()) {
            return badRequest(addUser.render(newUserForm, getCurrentUser()));
        }
        else {
             newUser = newUserForm.get();

        
                // Save the object to the Users table in the database
                newUser.save();
                         
                newUser.update();
        }
        

        flash("success", "User " + newUser.getName() + " has been created");

        return redirect(controllers.routes.ProductCtrl.index());
    }

}