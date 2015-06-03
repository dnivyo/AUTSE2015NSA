<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/default.css" type="text/css" />
        <title>Evidence Item Form</title>

        <script type="text/javascript">
            var n = 2;
            var array0 = ["AND", "OR"];
            var array = ["Author", "Title", "Year", "Methodology", "Method"];
            function addField(tableid)
            {
                // Creates row/col for and/or dropdown
                var row0 = document.createElement("tr");
                var col0 = document.createElement("td");
                
                var selectList0 = document.createElement("select");
                selectList0.id = "myAndOr";

                for (var i = 0; i < array0.length; i++) {
                    var option0 = document.createElement("option");
                    option0.value = array0[i];
                    option0.text = array0[i];
                    selectList0.appendChild(option0);
                }
                
                col0.appendChild(selectList0);
                row0.appendChild(col0);
                
                //Creates a selection list and search input field
                var row = document.createElement("tr");
                var col1 = document.createElement("td");
                var col2 = document.createElement("td");
                var col3 = document.createElement("td");
                var input = document.createElement("input");

                var selectList = document.createElement("select");
                selectList.id = "mySelect";

                for (var i = 0; i < array.length; i++) {
                    var option = document.createElement("option");
                    option.value = array[i];
                    option.text = array[i];
                    selectList.appendChild(option);
                }

                input.setAttribute("type", "text");
                input.setAttribute("name", "field" + n);

                col1.appendChild(document.createTextNode("Field " + n));
                col2.appendChild(selectList);
                col3.appendChild(document.createTextNode("Search: "));
                col3.appendChild(input);

                row0.appendChild(col0);
                row.appendChild(col1);
                row.appendChild(col2);
                row.appendChild(col3);

                var table = document.getElementById(tableid);

                table.appendChild(row0);
                table.appendChild(row);
                n++;
            }
            
            function removeField(tableid)
            {
                
            }
        </script>

    </head>
    <body>
        <div id="header">
            <h1><a href="index.jsp">SERLER <br/>
                    <p>Software Engineering Research Laboratory Education Repository</p></a></h1>
            <h2>
                Login<br/><br/>
                <form method="POST">
                    <input type="text" name="username" placeholder="Enter username" size="25" value=""><br /><br />
                    <input type="password" name="password" placeholder="Enter password" size="25" value=""> <br/> <br />
                    <input type="submit" value="Login"/> 
                    <input type="button" value="Register"/>
                </form>
            </h2>
        </div>
        <div id="content">
            <div id="colOne">
                <div id="menu">
                    <ul>
                        <li><a href="index.jsp" accesskey="1" title="">Home</a></li>
                        <li><a href="advancedSearch.jsp" accesskey="2" title="">Advanced Search </a></li>
                        <li><a href="#" accesskey="3" title="">Profile</a></li>
                        <li><a href="StudyFormServlet" accesskey="3" title="">Add Evidence</a></li>
                    </ul>
                </div>
