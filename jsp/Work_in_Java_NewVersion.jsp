<%-- 
    Document: Work_in_JavaNewVersion
    Version: 3.0
    Created on : 14/Abril/2013, 16:13
    Author : Antonio Rodrigues
--%>


<!DOCTYPE html>
<%@page import="model.suport.ReadTextDefinePath"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="read" scope="page" class="model.suport.ReadingSimpleWay"/>
<jsp:useBean id="pf" scope="page" class="model.classe.PersonalInformation"/>
<jsp:useBean id="estrela" scope="page" class="somework.Estrela"/>
<jsp:useBean id="numero" scope="page" class="somework.Numero"/> 
<jsp:setProperty name="pf" property="firstName" value="António"/>
<jsp:setProperty name="pf" property="lastName" value="Rodrigues"/>
<jsp:setProperty name="pf" property="nationality" value="Português" />
<jsp:setProperty name="pf" property="email" value="antonio.n.rodrigues@gmail.com"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/normalize.css" type="text/css" media="screen"/>
        <link rel="stylesheet" href="CSS/antonionrodrigues.css" type="text/css" media="screen"/>
        <link rel="shortcut icon" type="image/x-icon" href="Imagens/simbol.ico">
        <script src="JS/antonionrodrigues.js" type="text/javascript"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="JS/antonionrodriguesJQUERY.js" type="text/javascript"></script>
        <title>António Rodrigues</title>
    </head>
    
    <body id="workJava">
        
        <%!@Override
            /* Override do metodo init() do Jsp
             * inicialização do construtor com dois parametros para 
             * atribuir automaticamnete os path das pastas Text e ClassesSite.
             * Classes essas que são essencias para que esta Jsp possa ler atráves 
             * da Classe ReadingSimpleWay o conteudo dessas duas pastas.
             */
            public void init() throws ServletException {
                super.init(); 
                ReadTextDefinePath readPath = new ReadTextDefinePath(this.getServletContext().getRealPath("/Text"), 
                        this.getServletContext().getRealPath("/ClassesSite"));}       
        %> 
    
        <header id="headWorkJava">
           <div id="namePage">
                <p>public class <i>JavaWork </i>{<br>
                    while ("brain"=="awake"){<br>
                    System.out.println("there is some code to write");<br>
                    }}
                </p>
                
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
                            
        <div id="mainContent">
            
           
            <article>
                <h1>WebPage</h1>
                <img id="imagemSite" src="Imagens/FrontPage.jpg">
                <p>
                    As classes que fazem parte do site. 
                </p>
                
                <h3>Classes de Java</h3>
                <p>
                   As Classes de java serviram para criar o curriculo:<br> 
                   Education, EducationOverall, Experience, OrgEducationOver, 
                   OrgWorkExperience, PersonalInformation e WorkExperience.
                   <br>
                   As três classes ReadingSimpleWay, ReadTextDefinePath e 
                   ReadTextBeanFormat são classes auxiliares que permitem 
                   ler o conteudo das pastas. Estas classes permitem criar 
                   nesta JSP o ambiente de colocar o nome das classes nos 
                   respectivos botões. É desta forma que conteúdo de cada 
                   classe é 'transferida' para as áreas de texto.    
                   
                   Ficam a faltar aqui dois ficheiros essenciais o antonionrodrigues.css 
                   e antonionrodrigues.js, no entanto, decidi nao incluí-los porque 
                   é fácil, ter acesso a eles.
                   De referir que o trabalho de agarrar o evento 'onclick' 
                   de cada botão, abrir uma nova página com a textarea é 
                   feito através de código javascript.
                   
                  
                </p>    
                <c:forEach var ="nome" items="${read.listaJavaOutraPasta}">
                    <button id=${nome} class='buttonJavaSite' type="submit" value="OK"  
                            onclick="var id3=document.getElementById(id); 
                                showTextArea(id3, 'javaOutraPasta');">
                        ${nome}ava
                    </button>
               </c:forEach>   
               <h3>Java Server Pages</h3>
               <p>Estes são os ficheiros de jsp antes da compilação, 
                  para terem acesso a toda a informação e trabalho realizado.
               </p>
               <c:forEach var ="nome" items="${read.listaJSPOutrasPasta}">
                    <button id=${nome} class="buttonJSPSite" type="submit" value="OK"  
                            onclick="var id3=document.getElementById(id); 
                                showTextArea(id3, 'jspage');">
                        ${nome}
                    </button>
               </c:forEach> 
               <br><a id="aGitHub" href="https://github.com/AntonioNRodrigues/Curriculo" target="_blank" title="visualize o codigo na GitHub">Source Code</a>
              <div class="fadeInFadeOut"> </div>
            </article>
                    
            <article>
                <h1 id="imagemCodingBat">Codingbat</h1>
                <p>Resolução de exercicios encontrados em 
                    <a href="http://codingbat.com/">CodingBat.</a> 
                    O obejctivo de cada classe está declarado nela própria.</p>
                
                <c:forEach var ="nomeClasse" items="${read.listaJavaPasta}">
                    <button id=${nomeClasse} class="buttonCodingbat" type="submit" value="OK" 
                            onclick="var id3=document.getElementById(id); 
                                showTextArea(id3, 'javaCodingbat');">
                        ${nomeClasse}ava</button>
               </c:forEach>
            <br><a id="aGitHub" href="https://github.com/AntonioNRodrigues/CodingBat" target="_blank" title="visualize o codigo na GitHub">Source Code</a>
            <div class="fadeInFadeOut1"> </div>
            </article>
            <article>
                <h1 id='euro'>Euromilhoes</h1>
                <button id="gerarCodigo">Gera a tua chave do euromilhões</button><p></p>
                <div style="display: none" id="euroWindow"><p id="listaNumEstrela"><b>Estrelas:</b> ${estrela.sortedT} <br> <b>Números: </b>${numero.set}</p> </div>
                <button id="Estrela.j" class="buttonCodingbat" onclick="var id6=document.getElementById(id);showTextArea(id6, 'javaCodingbat');">Código Estrela</button>
                <button id="Numero.j" class="buttonCodingbat" onclick="var id6=document.getElementById(id);showTextArea(id6, 'javaCodingbat');">Código Número</button>
                <br><a id="aGitHub" href="https://github.com/AntonioNRodrigues/Euromilhoes" target="_blank" title="visualize o codigo na GitHub">Source Code</a>
                
                
                <div class="fadeInFadeOut2"> </div>
            </article>
              
        </div>
       
            <div id="classes" style="display:none">
                <c:forEach var ="textoClasse" items="${read.listaCompletaJavaPasta}">
                    <textarea class="j" rows="30" cols="94" readonly="readonly">${textoClasse}</textarea><br>
                </c:forEach>
            </div>
                
            <div class="classesJSP" style="display:none">
                <c:forEach var ="textoJSP" items="${read.listaCompletaJSPOutraPasta}">
                    <textarea class ="jsp" rows="30" cols="94" readonly="readonly">${textoJSP}</textarea><br>
                </c:forEach>
            </div>    
            
            <div class="classesJava" style="display:none">
                <c:forEach var ="textoJava" items="${read.listaCompletaJavaOutraPasta}">
                    <textarea class ="java" rows="30" cols="94" readonly="readonly">${textoJava}</textarea><br>
                </c:forEach>
            </div> 
         
             <div  id="CapaDiv" onmouseover="crescer('CapaDiv', 'Capa');" onmouseout="decrescer('CapaDiv', 'Capa');"><a id="Capa"href="FrontPage.jsp" ><em>Início</em></a></div>
             <div  id="CvDiv" onmouseover="crescer('CvDiv', 'Cv');" onmouseout="decrescer('CvDiv', 'Cv');"><a id="Cv"href="controladorPersonalPage" ><em>Currículo</em></a></div>
             <div  id="SobreDiv" onmouseover="crescer('SobreDiv', 'Sobre');" onmouseout="decrescer('SobreDiv', 'Sobre');"><a id="Sobre"href="AboutMe.jsp"><em>SobreMim</em></a></div>
                 

          <footer id="footerWorkJava">
              <p><a href="AboutMe.jsp" target="_blank"> <span style="font-size: 20px">&copy;</span> António Rodrigues 2013</a></p>
          </footer>   
                    
       
    </body>
</html>
