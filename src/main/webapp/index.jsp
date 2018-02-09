<!DOCTYPE html>
<html lang="en">
<head>
    <title>SO question 4112686</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    function edit(){
      $.ajax
        (
        {
            url:'GetUserServlet',
            //data:{name:'abc'},
            type:'put',
             //cache:false,
            success:function(){alert("edit");},
             }
    );
    }
    function del(){
    $.ajax
        (
        {
            
            url:'GetUserServlet',
            // data:{name:'abc'},
            type:'delete',
            // cache:false,
             success:function(){alert("delete");},
            }
    
    );
    }
</script>
    <script>
        $(document).ready(function() {  
            alert("1");                     
            $('#listbutton').click(function() { 
                    alert("list");
                // alert("2");
                $.post('GetUserServlet', function() { 
               
                });
                // alert("4");
            });
            // alert("5");
            // alert("6");
        // $(document).ready(function() {  
            $('#insertbutton').click(function() { 
                alert("insert");
                $.get('GetUserServlet', function() {        
                     });
                     });
        // });
        // $(document).ready(function() {  
            // $('#listbutton').click(function() {
            //     alert("list");
            //     $.put('GetUserServlet', function() {  });
            //          });
        // });

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

    <button id="insertbutton">insert</button>
    <button id="deletebutton" onclick="del()">delete</button>
    <button id="editbutton" onclick="edit()">edit</button>
    <button id="listbutton">list</button>
    <p id="somediv"> </p>
</body>