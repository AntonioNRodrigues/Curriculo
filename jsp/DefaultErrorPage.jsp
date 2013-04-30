<%-- 
    Document   : DefaultErrorPage
    Created on : 24/Nov/2012, 18:06:20
    Author     : Antonio Rodrigues
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="pf" scope="page" class="model.classe.PersonalInformation"/>
<jsp:setProperty name="pf" property="firstName" value="António"/>
<jsp:setProperty name="pf" property="lastName" value="Rodrigues"/>
<jsp:setProperty name="pf" property="nationality" value="Português" />
<jsp:setProperty name="pf" property="email" value="antonio.n.rodrigues@gmail.com"/>

<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/normalize.css" type="text/css" media="screen"/>
        <link rel="stylesheet" href="CSS/antonionrodrigues.css" type="text/css" media="screen"/> 
        <link rel="shortcut icon" type="image/x-icon" href="Imagens/simbol.ico">
        <script src="JS/antonionrodrigues.js" type="text/javascript"></script>
        <title>António Rodrigues</title>
    </head>
    <body id="workJava">
        <header id="headWorkJava">
           <div id="namePage">
                <p><i>Página de Erro</i><br>Alguma coisa correu mal ou ... <br>Estou de novo a realizar um update </p>
            </div>
            <div id="name">
                <h1>${pf.getFirstName()} ${pf.getLastName()}</h1>
                 <dl>
                    <dt><em>Email: </em> ${pf.getEmail()}</dt>
                    <dt><em>Nacionalidade:</em> ${pf.getNationality()}</dt>
                    <dt>
                     <a href="http://www.linkedin.com/pub/ant%C3%B3nio-rodrigues/31/552/163" target="_blank" title="Linkedin Profile"><img src="Imagens/linkedin-logo-square2Orange.png" alt="Linkedin Icon"></a> 
                    <a href="http://www.facebook.com/antonio.rodrigues.3150" target="_blank" title="FaceBook Profile"><img src="Imagens/facebook-logo-squareOrange.png" alt="facebook Icon"></a> 
                    <a href="https://twitter.com/#!/Antonio_N_R" target="_blank" title="Twitter Profile"><img src="Imagens/twitter-logo-squareOrange.png" alt="Twitter Icon"></a>
                    <a href="https://plus.google.com/u/0/100528116517419518481?rel=author" target="_blank" title="Google+ Profile"><img src="Imagens/google-logo-squareOrange.png" alt="Google plus icon"></a>
                    <a href="mailto:antonio.n.rodrigues@gmail.com?Subject=[FromWebPage]" title="Envie-me um email"><img src="Imagens/mail-squareOrange.png" alt="eMail Icon"></a>
                    <a href="https://github.com/AntonioNRodrigues" target="_blank" title="GitHub Profile"><img src="Imagens/github-logo-square.png" alt="GitHub Icon"></a>
                   </dt>
                </dl>
                    
                <div class="clear"></div>
            </div>
        </header>

             <div  id="CapaDiv" onmouseover="crescer('CapaDiv', 'Capa');" onmouseout="decrescer('CapaDiv', 'Capa');"><a id="Capa"href="FrontPage.jsp" ><em>Início</em></a></div>
             <div  id="CvDiv" onmouseover="crescer('CvDiv', 'Cv');" onmouseout="decrescer('CvDiv', 'Cv');"><a id="Cv"href="controladorPersonalPage" ><em>Currículo</em></a></div>
             <div  id="SobreDiv" onmouseover="crescer('SobreDiv', 'Sobre');" onmouseout="decrescer('SobreDiv', 'Sobre');"><a id="Sobre"href="AboutMe.jsp"><em>SobreMim</em></a></div>
                 

          <footer id="footerPageCurriculum">
              <p><a href="AboutMe.jsp" target="_blank"> <span style="font-size: 20px">&copy;</span> António Rodrigues 2013</a></p>
          </footer>   

    </body>
</html>
