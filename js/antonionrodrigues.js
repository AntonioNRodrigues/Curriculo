/****************************************************
 *                                                  *                
 *           FrontPage javaScript                   *            
 *                                                  *        
 *                                                  *                
 *                                                  *           
 ****************************************************/

/* Chama a função clearBlocoFrontPage()
 * funcção gerado pelo onmouseover de algum dos anchor tags do elemento 
 * linksEntrada. recebe o idElem que está a ser sobrevoado colocando-o 
 * com display=block ou seja visivel. 
 */
function popIn2(idElem){
        clearBlocoFrontPage();
        console.log(document.getElementById(idElem).style.display='block');     
}

/*Torna o elemento imagem não visivel*/
function clearBlocoFrontPage(){
    console.log(document.getElementById('imagemBackground').style.display='none');
}

/*funcção gerado pelo onmouseout de algum dos a tags do elemento 
 * linksEntrada. recebe o idElem que deixou de ser sovrevoado colocando-o 
 * com display=none
 * chama a função reposicionarBlocoFrontPage
*/
function normal2(idElem){
        console.log(document.getElementById(idElem).style.display='none');
        reposicionarBlocoFrontPage();
}

/* Default para o elemento imagem qdo não se está a sobrevoar nenhum das 
 * a tags do elemento linksEntradas. 
 */
function reposicionarBlocoFrontPage(){
    document.getElementById('imagemBackground').style.display='block';
}


/****************************************************
 *                                                  *                
 *           AboutMe javaScript                     *            
 *                                                  *        
 *                                                  *                
 *                                                  *           
 ****************************************************/


/* JavaScript file for the the AboutMe.jsp
 * Program que permite à medida que sobrevoamos os anos 
 * aparecam o div correpondente a esse ano.
 * Possuo uma div principal que é o que está sempre visivel 
 * até alguns dos anos serem sobrevoados */

/*funcção que premite receber o id do Elemento sobrevoado, 
 *bem como o id do elemento que irá ser tornado visivel.
 *essa var irá ser passada para o document.getEel..ById() 
 *que torna esse elemen to visivel.
 *Antes e chamado outra função. */
function popIn(idElem, idElemTransfor){
   
        clearBloco();
        document.getElementById(idElemTransfor).style.display='inline';     
}

/*Torna o elemento Bloco  não visivel*/
function clearBloco(){
    document.getElementById('bloco').style.display='none';
}

/*funcção que premite receber o id do Elemento sobrevoado, 
 *bem como o id do elemento que irá ser tornado invisivel
 *essa var irá ser passada para o document.getEel..ById()
 *que torna esse elemento invisivel
 *Antes e chamado outra função. */
function normal(idElem, idElemTransfor){
        document.getElementById(idElemTransfor).style.display='none';
        reposicionarBloco();
}

/* torna o elemento bloco visivel e sempre disponivel se não
 * houver sobrevoamento dos anos. */
function reposicionarBloco(){
    document.getElementById('bloco').style.display='block';
}

/* função relacionada com o menu de links para as outras paginas
 * se o butilizador sobrevoar umn dos botões e aumenta o width do 
 * elemento passado com argumento em 200px*/
function crescer(idEleCresce, id){
      for (var i=0; i<=200; i++){
        document.getElementById(idEleCresce).style.width=+ i+'px';
    }
}

/*Qdo o utilizador deixa de sobrevoar 
 * um dos botões e diminui o width do elemento passado com argumento em 200px*/
function decrescer(idEleDecresce, id){
    for (var j=0; j<180; j++){
       document.getElementById(idEleDecresce).style.width=- j+'px';
    }
    document.getElementById(idEleDecresce).style.width='20px';
}


/****************************************************
 *                                                  *                
 *           PageCurriculum javaScript               *            
 *                                                  *        
 *                                                  *                
 *                                                  *           
 ****************************************************/


/*funcção que premite receber o id do Elemento sobrevoado, 
 *bem como o id do elemento que irá ser tornado visivel.
 *essa var irá ser passada para o document.getEel..ById() 
 *que torna esse elemento visivel.
 *Antes é chamado outra função. 
*/
//inicialização do array
var arrayContent2=[6];

/*
 * Função que recebe todos os pedidos do onclick da pagina. Trata-os 
 * consoante se o pedido fôr para realizar a função reset agregado ao título 
 * ou se é para chamar cada componante da barra de navegação. 
 */
function popInPC(idElemTransfor2){
    if(idElemTransfor2==='content2'){
        apearContent2PC();
    }else{
        defineArray();
        clearContent2PC();
        document.getElementById(idElemTransfor2).style.display='inline-table';
    }
}

/* função que permite iniciar os array com cada id do elemento content2*/
function defineArray(){
        
        arrayContent2 [0]= document.getElementById('ExpDocente');
        arrayContent2 [1]= document.getElementById('ExpNatacao');
        arrayContent2 [2]= document.getElementById('ExpOutros');
        arrayContent2 [3]= document.getElementById('FormSup');
        arrayContent2 [4]= document.getElementById('FormCursosDesp');
        arrayContent2 [5]= document.getElementById('FormCursosProg');        
}

/*Torna o elemento Bloco  não visivel*/
function clearContent2PC(){
   for(var i=0; i<arrayContent2.length; i++){
       arrayContent2[i].style.display='none'; 
    }
    
}

/*Torna todos os elementos do array visiveis
*funcao de reset a ser aplicada ao título do pagina
*/
function apearContent2PC(){
   for(var i=0; i<arrayContent2.length; i++){
       arrayContent2[i].style.display='inline-table'; 
    }
}
/*
  * função relacionada com o menu de links para as outras paginas
  * se o utilizador sobrevoar um dos botões 
  * e aumenta o width do elemento passado com argumento em 200px
*/

function crescer(idEleCresce, id){     
      for (var i=0; i<=200; i++){
        document.getElementById(idEleCresce).style.width=+ i+'px';
    }
}

/*
 * Qdo o utilizador deixa de sobrevoar um dos 
 * botões e diminui o width do elemento passado com argumento em 200px
 */
function decrescer(idEleDecresce, id){
    for (var j=0; j<180; j++){
       document.getElementById(idEleDecresce).style.width=- j+'px';
    }
    document.getElementById(idEleDecresce).style.width='20px';
}

/****************************************************
 *                                                  *                
 *           Work_in_Java JavaScript                *            
 *                                                  *        
 *                                                  *                
 *                                                  *           
 ****************************************************/

/* Função que trata dos clicks dos botões dos diferentes butões da pagina
 * função que recebe dois argumentos: o id para saber qual foi o botão clicado 
 * e uma variavel de controlo para saber que a que class tem que ir procurar 
 * o conteudo correspondente desse botão.
 * Abre uma nova janela no browser com o respectivo conteudo. 
 * Inicialização de uma array com determinadas posições.
 * depois de realizar a primeira consição realiza a  
 * iteração desse array e coloca em cada posição um elemento 
 * com id gerado automaticamente no jsp.
 * Qdo o id alojado no array for o mesmo do id do botão clicado 
 * abre a janela com o conteudo desse id
 */
function showTextArea(id, contr){
    var myClasses=new Array(40);
    
    if(contr==='javaOutraPasta'){
        for(var i=0; i<myClasses.length; i++){
            myClasses[i]=document.getElementsByClassName('buttonJavaSite')[i];    
            if(myClasses[i]===id){
                var pp=document.getElementsByClassName('java')[i];
                        var newWindow=window.open('', '', 'width=600, height=530');
                        var tmp=newWindow.document;
                        tmp.write('<body style="background-color: black;">');
                        tmp.write('<textarea id="i" rows="30" cols="70" readonly="readonly">'+pp.innerHTML+'</textarea>');
                        tmp.write('</body>');
            }
        }
    }else if(contr==='jspage'){
        for(var i=0; i<myClasses.length; i++){
            myClasses[i]=document.getElementsByClassName('buttonJSPSite')[i];    
            if(myClasses[i]===id){
                var pp=document.getElementsByClassName('jsp')[i];
                        var newWindow=window.open('', '', 'width=600, height=530');
                        var tmp=newWindow.document;
                        tmp.write('<body style="background-color: black;">');
                        tmp.write('<textarea id="i" rows="30" cols="70" readonly="readonly">'+pp.innerHTML+'</textarea>');
                        tmp.write('</body>');
            }
        }
    }else if(contr==='javaCodingbat'){
        
        for(var i=0; i<myClasses.length; i++){
            myClasses[i]=document.getElementsByClassName('buttonCodingbat')[i];    
            if(myClasses[i]===id){
                var pp=document.getElementsByClassName('j')[i];
                        var newWindow=window.open('', '', 'width=600, height=530');
                        var tmp=newWindow.document;
                        tmp.write('<body style="background-color: black;">');
                        tmp.write('<textarea id="i" rows="30" cols="70" readonly="readonly">'+pp.innerHTML+'</textarea>');
                        tmp.write('</body>');
            }
        }
    }
 
}  
    
    /*função que permite ao clicar no botão com o id de gerarCodigo obter 
     * uma nova janela com com o conteudo do jogo do euromilhoes do div com o 
     * id de gerarCodigo que num estado default de display: none
     * FUNÇÃO NÃO UTILIZADA COM A INCLUSÃO DAS ANIMAÇÕES COM O JQUERY
     
    function gerarCodigoEuro(id){
        var p=document.getElementById(id);
        var newWindow=window.open('','','width=200, height=50');
        var tmp=newWindow.document;
        tmp.write(p.innerHTML);
    } 
*/