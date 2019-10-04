
notify=()=>{ alert("Servicio aun no disponible");}
BuscarFarma=()=>{
	
	
	var id 		  = $('#id').val();
	
	alert(`id ${id}`);
	 var paramentros = {
			 'id'			:id,
			
	 }
	 alert("2");
		$.ajax({
			data: paramentros,
			url : "inventory",
			type: "post",
			beforeSend:function(){
				$("#mostrartable").html('<center><img src="/factu/resources/images/loading.gif" alt="" width="150" height="150" /><br> <h3>BUSCANDO...<h3></center>')
				
			},
			success: function(response){
				
				$("#divSearch").html(response);				
			},
			error: function(){
				$("#divSearch").html("CONTACTAR A SISTEMAS!!");
			}
		});
	
}