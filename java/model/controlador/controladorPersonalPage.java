/*
 * Controlador que trata dos pedidos da FrontPage e 
 * instância as várias classes de Java.
 * O pedido é respondido para a página Curriculum.jsp.
 */
package model.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.classe.Curriculo;
import model.classe.PersonalInformation;
import model.classe.education.EducationOverall;
import model.classe.education.OrgEducationOver;
import model.classe.experiences.OrgWorkExperience;
import model.classe.experiences.WorkExperience;

/**
 * @author Antonio Rodrigues
 * @version 2.0
 */
@WebServlet(name = "controladorPersonalPage", urlPatterns = {"/controladorPersonalPage"})



public class controladorPersonalPage extends HttpServlet {

    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                
        PrintWriter out = response.getWriter();
        try {
            //instanciação do construtor da classe PersonalInformation com os respectivos argumentos
            PersonalInformation pI=new PersonalInformation("António", "Rodrigues", "António Rodrigues", "000000000", 
            "antonio.n.rodrigues@gmail.com", "Português", "1981/03/06", "Male");
          
            /* Instanciacao do construtor sem argumentos da classe 
             * EducationOverall que por sua inicializa um ArrayList<Education> 
             * que como é vísivel só recebe obejctos do tipo Education;
             * A classe Education tem um construtor que recebe 4 argumentos, 
             * a saber: date, title, principalSubjects e nameOrganisation.
            */
            EducationOverall edOverall= new EducationOverall();
            
            
            //Preenchimento da lista com objectos do tipo Education
            edOverall.addEducation("2012",
                    "Oracle Certified Expert, Java Platform, EE 6 Web Component Developer",
                    "Exame de certificação (1Z0-899) ao nível do Java Enterprise Edition 6.",
                    "Oracle Certified Expert");
            edOverall.addEducation("2012",
                    "Oracle Certified Professional, Java SE 6 Programmer",
                    "Exame de certificação (1Z0-851) ao nível do Java Standard Edition 6.",
                    "Oracle Certified Professional");
            edOverall.addEducation("2012",
                    "Business Component Development with EJB Technology, Java EE6",
                    "Introduction to java EE, implementing session beans, accessing session beans, advanced session beans concepts, singleton session beans, developing java EE applications using messaging, developing message-driven beans, using timer services objectives, implementing interceptor classes and methods, implementing transactions, implementing security, using EJB technology best practices.",
                    "Academia de Java/Rumos");
            edOverall.addEducation("2012",
                    "Web Component Development with Servlet and JSP",
                    "Introduction to java servlets, introduction to java server pages, implementing an MVC design, the servlet´s environment, container facilities for servlets and JSPs, more view facilities, development JSP pages, development JSP pages using custom tags, more controller facilities, more options for the model, asynchronous web applications, web application security.",
                    "Academia de Java/Rumos");
            edOverall.addEducation("2012",
                    "SL-275-SE6 Java Programming Language, Java SE 6",
                    "Object-oriented programming, identifiers, keywords, and types, expressions and flow control, arrays, class design, advanced class features, exceptions and assertions, collections and generics framework, I/O fundamentals, console I/O and file I/O, building java GUI using the swing API, handling GUI-generated events, GUI-based applications, threads, networking.",
                    "Academia de Java/Rumos");
            edOverall.addEducation("2012",
                    "SL-110-SE6 - Fundamentals of the Java Programming Language, Java SE 6",
                    "Explaining Java Technology,  Analyzing a Problem and Designing a Solution, Developing and testing a java technology program, declaring, initializing, and using variables, Creating  and using objects, using operators and decision constructs, using loop constructs, developing and using methods, implementing encapsulation and constructors, creating and using arrays, implementing inheritance.",
                    "Academia de Java/Rumos");
            edOverall.addEducation("2012",
                    "Curso Básico de Socorrismo",
                    "Curso Básico de Socorrismo",
                    "AMI");
            edOverall.addEducation("2011",
                    "Curso de Programação em Java",
                    "Introdução à programação em Java, Entrada e saída de dados, programação orientada a objectos, Applets para a web, Grafismo multimédia e movimento, Interactividade, Interface gráfico, Acesso a bases de dados. ",
                    "Alta Lógica Instituto de Formação Profissional, Lda.");
            edOverall.addEducation("2010",
                    "Acção de Formação – “Quadros interactivos Multimédia no Ensino/Aprendizagem das Artes e Expressões”",
                    "Competências ao nível da interacção com os quadros interactivos, bem como, do software ActivInspire da Promethean.",
                    "Centro de Formação de Escolas dos Concelho do Barreiro Moita");
            edOverall.addEducation("2009",
                    "Acção de Formação – “A Dança nos Programas Nacionais de Educação Física: Danças Tradicionais Portuguesas – Nível Introdutório”",
                    "Danças Tradicionais Portuguesas - Nível Introdutório",
                    "Centro de Formação de Associações de Escolas da Zona Oriental do Concelho de Loures");
            edOverall.addEducation("2007",
                    "Curso de Monitores de Desporto Aventura",
                    "Arbitragem de jogos de paintball, bem como, todos os procedimentos necessários para pôr em prática este tipo de actividade. Técnica de manobras de cordas simples para a execução das actividades no parque como rappel, escalada, slide, pontes de cordas e simulação de salto com pára-quedas.",
                    "Parque Aventura Sniper");
            edOverall.addEducation("2006",
                    "Pós-graduação – Envelhecimento: Actividade Física e Autonomia Funcional",
                    "Programas de exercício – Treino da força, treino do equilíbrio, treino aquático, treino aeróbio. Avaliação da função neuromuscular, função cardio-respiratória, locomoção, comportamento postural, aptidão funcional, morfológica do idoso.\n" +
                    "Concepção de programas de exercício.\n" +
                    "Alterações da função neuromuscular; ostearticulares.",
                    "Faculdade de Motricidade Humana da Universidade Técnica de Lisboa ");
            edOverall.addEducation("2000-2005", 
                    "Licenciatura em Ciências do Desporto e Educação Física", 
                    "Anatomia I, II, \n" +
                    "Fisiologia geral I, geral II e do exercício, \n" +
                    "Estudos Práticos – futebol, andebol, basquetebol, rugby, atletismo, ginástica aparelhos e de solo, natação I e II, canoagem, \n" +
                    "Recreação I, II, III, \n" +
                    "Métodos quantitativos I e II, \n" +
                    "Controlo motor e aprendizagem, \n" +
                    "Observação e análise pedagógica, \n" +
                    "Ensino integrado, \n" +
                    "Estágio pedagógico.", 
                    "Faculdade de Ciências do Desporto e Educação Física da Universidade de Coimbra");
           
            /* Instanciação do construtor sem argumentos da classe 
             * WorkExperience que por sua inicializa um ArrayList<Experience> 
             * que como é vísivel só recebe obejctos do tipo Experience;
             * A classe Experience tem um construtor que recebe 4 argumentos, 
             * a saber: date, job, jobActivite e place.
             */
            WorkExperience wExperience= new WorkExperience ();
            
            //Preenchimento da lista com objectos do tipo Experience
            wExperience.addExperience("De Outubro de 2012 até à data",
                    "Docente",
                    "Leccionar a disciplina de Educação Física do 2º ao 4º ano de escolaridade (1ºCiclo).",
                    "Escola N.º2 da Bobadela (Lisboa).");
            wExperience.addExperience("Desde Setembro 2010 até à data", 
                    "Professor",
                    "Lecionar aulas de natação", 
                    "Holmes Place - Dolce Vita Tejo (Amadora)");
            wExperience.addExperience("De Setembro 2010 a Agosto de 2011", 
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 3 turmas do 3ºCiclo (9h por semana)", 
                    "Escola Básica Integrada Patrício Prazeres (Lisboa)");
            wExperience.addExperience("De Setembro 2009 a Agosto de 2010",
                    "Docente",
                    "Leccionar a disciplina de Educação Física/ Área de Expressões a 5 turmas do Secundário - Cursos Profissionais /3.ºCiclo - Cursos de Educação e Formação; Treinador da equipa de Futsal Feminino no âmbito do Desporto Escolar (horário completo 22h + 2 horas extraordinárias).",
                    "Escola Secundária da Moita (Moita).");
            wExperience.addExperience("De Outubro de 2008 a Agosto de 2009",
                    "Docente",
                    "Leccionar a disciplina de Educação Física/ Área Projecto a 4 turmas do 3ºCiclo (14h por semana)",
                    "Escola EB2/3 Alto do Moinho (Catujal - Loures).");
            wExperience.addExperience("De Setembro de 2008 a Outubro de 2008.",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 4 turmas do 1ºCiclo (12h por semana).",
                    "Escola EB1 nº1 de Casal de Cambra.");
            wExperience.addExperience("De Setembro de 2008 a Outubro de 2008.",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 4 turmas do 3ºCiclo ao Secundário (11h por semana).",
                    "Colégio D. Filipa (Amadora)");
            wExperience.addExperience("Julho/Agosto de 2008 (2 semanas)",
                    "Coordenador de uma equipa de animação de praia",
                    "Organização, implementação e arbitragem de torneios de futebol de praia, bitoque rugby e futebol 2x2.",
                    "C.I Eventos, Leiriasport (praia do Pedrogão)");
            wExperience.addExperience("Julho de 2008 (1 turno de 1 semana de Campos de Férias)",
                    "Animador/Monitor de Campos de Férias",
                    "Monitor e animador de Campos de Férias com actividades de desporto aventura e de carácter recreativo.",
                    "Sniper, Parque Aventura(Bucelas)");
            wExperience.addExperience("De Setembro de 2007 a Junho de 2008",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 4 turmas do 3ºCiclo ao Secundário (10h por semana).",
                    "Colégio D. Filipa (Amadora)");
            wExperience.addExperience("De Outubro de 2007 a Junho de 2008",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 4 turmas do 1ºCiclo (8h por semana).",
                    "Escola EB1 nº1 de Casal de Cambra");
            wExperience.addExperience("De Julho de 2007 (2 turnos de 1 semana de Campos de Férias)",
                    "Animador/Monitor de Campos de Férias",
                    "Monitor e animador de Campos de Férias com actividades de desporto aventura e de carácter recreativo.",
                    "Sniper, Parque Aventura(Bucelas)");
            wExperience.addExperience("Desde Maio de 2007 até à data (trabalho ocasional)",
                    "Monitor de Desporto Aventura",
                    "Monitorizar actividades como Pontes de Cordas, Rappel, Escalada, Slide, Simulação de Pára-quedas e Arbitrar Jogos de Paintball.",
                    "Sniper, Parque Aventura (Bucelas)");
            wExperience.addExperience("De Outubro de 2006 a Junho de 2007",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 5 turmas do 1ºCiclo (10h por semana).",
                    "Escola EB1 nº1 de Casal de Cambra");
            wExperience.addExperience("De Setembro de 2006 a Junho de 2007 ",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 5 turmas do 3ºCiclo ao Secundário (12h por semana).",
                    "Colégio D. Filipa (Amadora)");
            wExperience.addExperience("De Setembro de 2006 a Outubro de 2006",
                    "Docente",
                    "Leccionar a disciplina de Educação Física a 4 turmas do 1ºCiclo (9h por semana).",
                    "Escola D. Pedro V (Linda-a-Velha)");
            wExperience.addExperience("De Setembro de 2005 a Junho de 2006",
                    "Docente",
                    "Leccionar a disciplina de Educação Física do 1º ao 4º ano de escolaridade (1ºCiclo).",
                    "Centro Comunitário de Casal da Cambra – Solami (Sintra)");
            wExperience.addExperience("De Janeiro de 2006 a Março de 2006",
                    "Treinador Adjunto de Futebol 11","Assistir o treinador principal na orientação e preparação da equipa de juvenis.",
                    "Clube Desportivo dos Olivais e Moscavide (Lisboa)");
            wExperience.addExperience("De Setembro de 2004 a Março de 2005",
                    "Docente Estagiário",
                    "Leccionei a disciplina de Educação Física ao 9ºano de escolaridade.",
                    "Escola Básica do 2º e 3º Ciclos de Anadia (Aveiro)");
            wExperience.addExperience("Agosto de 2003 (1 semana)",
                    "Monitor de Colónia de Férias / Actividades Desportivas",
                    "Acompanhar e desenvolver actividades junto de um grupo de jovens que estava sobre a minha responsabilidade, durante o dia.",
                    "Equinócio (Lisboa)");
            wExperience.addExperience("Julho de 2003 (2 semanas) e Julho de 2002 (2 semanas)",
                    "Monitor de Colónia de Férias / Actividades Recreativas",
                    "Acompanhar e desenvolver actividades junto de um grupo de jovens que estava sobre a minha responsabilidade, durante vários dias consecutivos.",
                    "Junta de Freguesia de Famões (Odivelas)");
            
           
            Curriculo c= new Curriculo(pI, wExperience, edOverall);
            
            //Instanciação da classe OrgWorkExperience
            OrgWorkExperience oe= new OrgWorkExperience();
            /* Chamada do metodo para organizar a lista preenchida pela 
             * classe workExperience e subdividi-la em 3 lista 
             * consoante as suas caracteríticas*/
            oe.org(wExperience.getExp());
            List expEdFisica=oe.getExperEdFisica();
            List expNatacao=oe.getExperNatacao();
            List expMonitor=oe.getExperMonitor();
            
             //Instanciação da classe OrgEducationOverall
            OrgEducationOver oEduc = new OrgEducationOver();
             /* Chamada do metodo para organizar a lista preenchida pela 
             * classe EducationOverall e subdividi-la em 3 lista 
             * consoante as suas caracteríticas*/
            oEduc.orgEduc(edOverall.getEduc());
            List eduSup= oEduc.getFormSuperior();
            List eduFormProg= oEduc.getFormacaoProg();
            List eduFormDesp= oEduc.getFormacaoDesp();
            
            String birthDate = c. getPersInf().getBirthDate();
            String email = c.getPersInf().getEmail();
            String fullName = c.getPersInf().getFullName();
            String gender = c.getPersInf().getGender();
            String lastName = c.getPersInf().getLastName();
            String nationality = c.getPersInf().getNationality();
            String mobilephone = c.getPersInf().getMobilephone();
            String firstName= c.getPersInf().getFirstName();
            String endT=c.getPersInf().getEndTwitter();
            String endF=c.getPersInf().getEndFacebook();
            String endL=c.getPersInf().getEndLinkedin();
   
           String date="",job="",jobActivite="",place="";
            
        
             RequestDispatcher rd = 
                  request.getRequestDispatcher("PageCurriculum.jsp" );
                  request.setAttribute("fullName", fullName);
                  request.setAttribute("Email", email);
                  request.setAttribute("phone", mobilephone);
                  request.setAttribute("firstName", firstName+ " ");
                  request.setAttribute("lastName", lastName);
                  request.setAttribute("date", date);
                  request.setAttribute("expEdFisica", expEdFisica);
                  request.setAttribute("expNatacao", expNatacao);
                  request.setAttribute("expMonitor", expMonitor);
                  request.setAttribute("job", job);
                  request.setAttribute("jobActivite", jobActivite);
                  request.setAttribute("place", place);
                  request.setAttribute("nac", nationality);
                  request.setAttribute("endT", endT);
                  request.setAttribute("endF", endF);
                  request.setAttribute("endL", endL);
                  request.setAttribute("eduFormDesp", eduFormDesp);
                  request.setAttribute("eduFormProg", eduFormProg);
                  request.setAttribute("eduSup", eduSup);
                              
                  rd.forward(request, response);
 
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

 
}
