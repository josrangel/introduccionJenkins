def suma(a,b){
    return a+b
}
def resta(a,b){
    return a-b
}
def multiplicacion(a,b){
    return a*b
}
def division(a,b){
    return a/b
}

node{
stage("parametros"){
OPCION="${OPCION}"
def resultado=0
}

stage("computa"){
//echo "${OPCION}"
echo "val1= ${VALOR1}"
echo "val2= ${VALOR2}"

switch(OPCION){
    case "1"://SUMA
    echo "SUMA"
        resultado=suma("${VALOR1}".toInteger(),"${VALOR2}".toInteger())  
        break;
    case "2"://RESTA
    echo "RESTA"
        resultado=resta("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
        break;
    case "3"://MULTIPLICACION
    echo "MULTIPLICACION"
        resultado=multiplicacion("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
        break;
    case "4"://DIVISION
    echo "DIVISION"
        resultado=division("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
        break;
}
echo "${resultado}"
}

}


----------------------
def suma(a,b){
    return a+b
}
def resta(a,b){
    return a-b
}
def multiplicacion(a,b){
    return a*b
}
def division(a,b){
    return a/b
}
pipeline{
    agent any
    stages{
        stage("parametros"){
            steps{
                script {
                    OPCION="${OPCION}"
                    
                }
            }
        }

        stage("computa"){
            steps{
                script {
                    resultado=0
                    //echo "${OPCION}"
                    echo "val1= ${VALOR1}"
                    echo "val2= ${VALOR2}"

                    switch(OPCION){
                        case "1"://SUMA
                            echo "SUMA"
                            resultado=suma("${VALOR1}".toInteger(),"${VALOR2}".toInteger())  
                            break;
                        case "2"://RESTA
                            echo "RESTA"
                            resultado=resta("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
                            break;
                        case "3"://MULTIPLICACION
                            echo "MULTIPLICACION"
                            resultado=multiplicacion("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
                            break;
                        case "4"://DIVISION
                            echo "DIVISION"
                            resultado=division("${VALOR1}".toInteger(),"${VALOR2}".toInteger())
                        break;
                    }
                    echo "${resultado}"
                }
            }
        }

    }
}