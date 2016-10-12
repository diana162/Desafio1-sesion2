<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Suscribete - Plataforma Web</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1>Gracias por unirte a nuestra lista de correo</h1>

    <p>Aqui esta la información que ingresaste:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    
    <label>Nombre:</label>
    <span>${user.firstName}</span><br>
    
    <label>Apellidos:</label>
    <span>${user.lastName}</span><br>
    
       
    <label>Direccion:</label>
    <span>${user.direccion}</span><br>
    
    <label>Telefono:</label>
    <span>${user.telefono}</span><br>
    
    <label>Referido:</label>
    <span>${user.referido}</span><br>
    

    <p>Para ingresar otra dirección email, dale click en el
        boton regresar en el explorador o el boton Regresar 
        que se muestra debajo.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Regresar">
    </form>

</body>
</html>