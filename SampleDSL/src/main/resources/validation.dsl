[condition][]The {object} does not have {field}=${object} : {object}( {field} == null )
[condition][] or it is blank =  == "" || 
[condition][]phone number=phoneNumber

[consequence][]Display {message_type} for {object}= System.out.println( "Erro: "+${object} );
[consequence][]Display {message_type}= System.out.println("Erro");