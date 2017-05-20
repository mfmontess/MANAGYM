<% 

        String rol = null;
        String identificacion = null;
        try {
            rol = (String)session.getAttribute("rol"); 
            identificacion = (String)session.getAttribute("identificacion");
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
        if(rol == null) {
           out.print("<script type=\"text/javascript\">alert(\"Error: datos incorrectos\");window.location=\"sesion.jsp\";</script>");
        } 
        
%>