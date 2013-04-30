<%-- 
    Document   : PageCurriculum
    Created on : 20/Mai/2012, 18:13:01
    Author     : Antonio Rodrigues
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="António Rodrigues" />
        <meta name="description" content="Personal Site" />
        <link rel="stylesheet" href="CSS/normalize.css" type="text/css" media="screen"/>
        <link rel="stylesheet" href="CSS/antonionrodrigues.css" type="text/css" media="screen"/>
        <link rel="shortcut icon" type="image/x-icon" href="Imagens/simbol.ico">
        <script src="JS/antonionrodrigues.js" type="text/javascript"></script>
        
        <title>${fullName}</title>
    </head>
    
    <body id="bodyPageCurriculum">
       
        <header class="headerPageCurriculum" >
            <div id="namePage">
                <a href="#" onclick="popInPC('content2');" title="Conteúdo total da página"><p><i>Curriculum vitae</i></p></a>
            </div>
            <div class="name">
                <h1>${fullName}</h1>
                 <dl>
                    <dt><em>Email:</em> ${Email}</dt>
                    <dt><em>Nacionalidade:</em> ${nac}</dt>     
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
                     
            <div id="content">
                
                <div id="barraNavegacao">
                    <ul id="tabelas">
                        <li id="tituloBarraNav1">Educação</li>
                            <li><a href="#" onclick="popInPC('FormSup');" title="Conteúdo referente à formação superior">Formação Superior</a></li>
                            <li id="dif">Cursos/Formações</li>
                            <li><a href="#" onclick="popInPC('FormCursosProg');">Área - Programação</a></li>
                            <li><a href="#" onclick="popInPC('FormCursosDesp');">Área - Desporto</a></li>
                            
                        
                        <li id="tituloBarraNav2">Experiência Profissional</li>
                            <li><a href="#" onclick="popInPC('ExpDocente');">Docencia</a></li>
                            <li><a href="#" onclick="popInPC('ExpOutros');">Desp. Aventura/Outros</a></li>
                            <li><a href="#" onclick="popInPC('ExpNatacao');">Natação</a></li>
                        
                        <li id="tituloBarraNav3">Portefólio</li>
                        <li><a href="http://www.codecademy.com/pt/users/antoniorodrigues" target="_blank">CodeAcademy</a></li>
                        <li><a href="http://www.khanacademy.org/profile/AntonioRodrigues/" target="_blank">KhanAcademy</a></li>
                    <!--<li><a href="http://teamtreehouse.com/antoniorodrigues" target="_blank">TreeHouse</a></li>-->

                    </ul>
                    </div>     

               
                <div id="content2">
                     <ul id="FormCursosProg">
                            <c:forEach var="eduFormProg" items="${eduFormProg}"> 
                                <li><b>Datas: </b>${eduFormProg.date} <br> 
                                    <b>Designação da qualificação atribuída: </b>${eduFormProg.title} <br>
                                    <b>Principais disciplinas/competências profissionais: </b>${eduFormProg.principalSubjects} <br>
                                    <b>Entidade: </b>${eduFormProg.nameOrganisation} <br>
                                </li>
                            </c:forEach>    
                    </ul>
                       
                    <ul id="FormSup">
                            <c:forEach var="eduSup" items="${eduSup}"> 
                                <li>
                                    <b>Datas: </b>${eduSup.date} <br> 
                                    <b>Designação da qualificação atribuída: </b>${eduSup.title} <br>
                                    <b>Principais disciplinas/competências profissionais: </b>${eduSup.principalSubjects} <br>
                                    <b>Entidade: </b>${eduSup.nameOrganisation} <br>
                                </li>
                            </c:forEach>    
                    </ul>
            
                     <ul id="FormCursosDesp">
                            <c:forEach var="eduFormDesp" items="${eduFormDesp}"> 
                                <li><b>Datas: </b>${eduFormDesp.date} <br> 
                                    <b>Designação da qualificação atribuída: </b>${eduFormDesp.title} <br>
                                    <b>Principais disciplinas/competências profissionais: </b>${eduFormDesp.principalSubjects} <br>
                                    <b>Entidade: </b>${eduFormDesp.nameOrganisation} <br>
                                </li>
                            </c:forEach>    
                    </ul>
                    
                    <ul id="ExpDocente">
                            <c:forEach var="expEdFisica" items="${expEdFisica}"> 
                                <li>
                                    <b>Datas: </b>${expEdFisica.date} <br> 
                                    <b>Função ou cargo ocupado: </b>${expEdFisica.job} <br>
                                    <b>Principais actividades e responsabilidades: </b>${expEdFisica.jobActivite} <br>
                                    <b>Local: </b>${expEdFisica.place} <br>
                                </li>
                            </c:forEach>    
                    </ul>
                    <ul id="ExpNatacao">
                           <c:forEach var="expNatacao" items="${expNatacao}"> 
                                <li>
                                    <b>Datas: </b>${expNatacao.date} <br> 
                                    <b>Função ou cargo ocupado: </b>${expNatacao.job} <br>
                                    <b>Principais actividades e responsabilidades: </b>${expNatacao.jobActivite} <br>
                                    <b>Local: </b>${expNatacao.place} <br>
                                </li>
                            </c:forEach>    
                    </ul>
                    <ul id="ExpOutros">
                            <c:forEach var="expMonitor" items="${expMonitor}"> 
                                <li>
                                    <b>Datas: </b>${expMonitor.date} <br> 
                                    <b>Função ou cargo ocupado: </b>${expMonitor.job} <br>
                                    <b>Principais actividades e responsabilidades: </b>${expMonitor.jobActivite} <br>
                                    <b>Local: </b>${expMonitor.place} <br>
                                </li>
                            </c:forEach>    
                   </ul>
              
                </div>
		</div>
                  
                      <div  id="CapaDivPC" onmouseover="crescer('CapaDivPC', 'CapaPC');" onmouseout="decrescer('CapaDivPC', 'CapaPC');"><a id="CapaPC"href="FrontPage.jsp" ><em>Início</em></a></div>
                      <div  id="JavaDivPC" onmouseover="crescer('JavaDivPC', 'JavaPC');" onmouseout="decrescer('JavaDivPC', 'JavaPC');"><a id="JavaPC"href="Work_in_Java_NewVersion.jsp" ><em>Projectos</em></a></div>
                      <div  id="SobreDivPC" onmouseover="crescer('SobreDivPC', 'SobrePC');" onmouseout="decrescer('SobreDivPC', 'SobrePC');"><a id="SobrePC"href="AboutMe.jsp"><em>SobreMim</em></a></div>
                 
            <div id="footerPageCurriculum">
                <p><a href="AboutMe.jsp" target="_blank"> <span style="font-size: 20px">&copy;</span> António Rodrigues 2013</a></p>
            </div>
            
    </body>
</html>
