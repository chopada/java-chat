<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var senderName="";
		while(senderName.trim()==""){
			senderName=window.prompt("Enter Your Name:");
		}
		$('.panel-title').text(senderName.toUpperCase());
		$('#sendMsg').click(function(e) {
			e.preventDefault();
			var userName = $("#userName").val().trim();
			if(userName=="") return;
			var value = 'msg='+senderName.toUpperCase()+' Say : ' + userName;

			$.ajax({
				url : "${pageContext.request.contextPath}/set",
				type : "POST",
				data : value,
				cache : false,
				success : function(data) {
					$("#userName").val('');
					getMsg();
				}
			});
		});
		$("#userName").keyup(function(event){
		    if(event.keyCode == 13){
		        $("#sendMsg").click();
		    }
		});
		getMsg()
	});
</script>
<script>
function getMsg(){
	$.ajax({
		url : "${pageContext.request.contextPath}/get",
		type : "GET",
		cache : false,
		success : function(data) {
			//console.log(data);
			$("#message").html("")
			for(var i=0;i<data.length;i++){
				$("#message").append("<li>"+data[i]+"</li>").slideDown('slow');
			}
			
			var $chat = $('.chat-body');
            //$chat.animate({scrollTop: $chat.prop("scrollHeight")}, 10);
            var scrollTo_val = $chat.prop('scrollHeight') + 'px';
			$chat.animate({ scrollTop: scrollTo_val }, 1000);
		}
	}); $(path.ori.contectPth)
}
</script>
<style type="text/css">
.chat-body{
	height:500px;
	margin:0 auto;
	width:100%;
	display:inline-block;
	overflow-y: scroll;
	overflow-x:hidden;
}
#message{
	background: #f4f4f4;
	padding:10px;
}
#message li{
	display:block !important;
	list-style:none;
	width:100%;
	padding:5px 10px;
	margin:5px 10px;
}
#message li:nth-of-type(odd) { background:#f9f9f9;  }
#message li:nth-of-type(even) { background:#ccc; text-align:right; }

.no-padding { padding:0px !important; }
</style>
</head>
<body>
	
	
	<div class="container">
		<h2 class="text-center"> Welcome Techhive Chat</h2>
		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-success">
					<div class="panel-heading"> <div class="panel-title"> name </div> </div>
					<div class="panel-body no-padding">
						<div class="chat-body">
							<ul id="message"></ul>
						</div>
					</div>
					<div class="panel-footer">
						<div class="input-group">
						  <input type="text" class="form-control" id="userName" autocomplete="off">
						  <span class="input-group-addon" id="sendMsg">Send</span>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>
