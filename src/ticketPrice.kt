fun main(){
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
    var ticket = 0
    if((age < 1) || (age > 100)){
        println("Favor inserir uma idade valida!")
        return 0;
    }
    else if(age < 13){
        ticket = 15
        return ticket
    }
    else if (age < 61) {
        ticket = 30
        if (isMonday) {
            ticket -= 5
            return ticket
        }else {
            println("Não é segunda então o preço é normal!")
        }
        return ticket;
    }
    else if(age > 60){
        var teste = 20
        return teste
    }
    else{
        println("Não foi possível calcular!")
        return 0;
    }
}

