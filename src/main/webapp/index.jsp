<!DOCTYPE html>
<html lang="en">
<head>
    <title>SO question 4112686</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        $(document).ready(function() {  
            alert("1");                     
            $('#somebutton').click(function() { 
                alert("2");
                $.post('GetUserServlet', function() { 
                    $('#somediv').text("dinesh");       
                    alert("3");
                });
                alert("4");
            });
            alert("5");
            alert("6");
        });

        // $("#somebutton").click(function(){
        //  $.ajax({
            // url:'GetUserServlet',
            // data:{name:'abc'},
            // type:'get',
            // cache:false,
            // success:function(data){
            //    alert(data);
            //    $('#somediv').text(responseText); 
            // },
            // error:function(){
    //           alert('error');
    //         }
    //      }
    // );
// }
// );
    </script>
</head>
<body>

    <button id="somebutton">press here</button>
    <p id="somediv"> </p>
</body>