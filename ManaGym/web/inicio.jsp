
<%@page import="java.util.Iterator.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="User" scope="session" class="Managym.Usuario"/>


<!DOCTYPE HTML>
<html>
    <head>
        <title>Managym</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <!-- Custom CSS -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Graph CSS -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- jQuery -->
        <link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
        <!-- lined-icons -->
        <link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
        <!-- //lined-icons -->
        <script src="js/jquery-1.10.2.min.js"></script>
        <script src="js/amcharts.js"></script>	
        <script src="js/serial.js"></script>	
        <script src="js/light.js"></script>	
        <script src="js/radar.js"></script>	
        <link href="css/barChart.css" rel='stylesheet' type='text/css' />
        <link href="css/fabochart.css" rel='stylesheet' type='text/css' />
        <!--clock init-->
        <script src="js/css3clock.js"></script>
        <!--Easy Pie Chart-->
        <!--skycons-icons-->
        <script src="js/skycons.js"></script>

        <script src="js/jquery.easydropdown.js"></script>

        <!--//skycons-icons-->
    </head> 
    <body>
        <div class="page-container">
            <!--/content-inner-->
            <div class="left-content">
                <div class="inner-content">
                    <!-- header-starts -->
                    <div class="header-section">
                        <!--menu-right-->
                        <div class="top_menu">
                           <!--/profile_details-->
                            <div class="profile_details_left">
                                <ul class="nofitications-dropdown">
                                    <li class="dropdown note dra-down">
                                        <script type="text/javascript">

                                            function DropDown(el) {
                                                this.dd = el;
                                                this.placeholder = this.dd.children('span');
                                                this.opts = this.dd.find('ul.dropdown > li');
                                                this.val = '';
                                                this.index = -1;
                                                this.initEvents();
                                            }
                                            DropDown.prototype = {
                                                initEvents: function () {
                                                    var obj = this;

                                                    obj.dd.on('click', function (event) {
                                                        $(this).toggleClass('active');
                                                        return false;
                                                    });

                                                    obj.opts.on('click', function () {
                                                        var opt = $(this);
                                                        obj.val = opt.text();
                                                        obj.index = opt.index();
                                                        obj.placeholder.text(obj.val);
                                                    });
                                                },
                                                getValue: function () {
                                                    return this.val;
                                                },
                                                getIndex: function () {
                                                    return this.index;
                                                }
                                            }

                                            $(function () {

                                                var dd = new DropDown($('#dd'));

                                                $(document).click(function () {
                                                    // all dropdowns
                                                    $('.wrapper-dropdown-3').removeClass('active');
                                                });

                                            });

                                        </script>
                                    </li>
                                		   							   		
                                    <div class="clearfix"></div>	
                                </ul>
                            </div>
                            <div class="clearfix"></div>	
                            <!--//profile_details-->
                        </div>
                        <!--//menu-right-->
                        <div class="clearfix"></div>
                    </div>
                    <!-- //header-ends -->
                    <div class="outter-wp">
                        <!--custom-widgets-->
                        <div class="custom-widgets">
                            <div class="row-one">
                                <div class="col-md-3 widget">
                                    <div class="stats-left ">
                                        <h5>Hoy</h5>
                                        <h4> Usuarios</h4>
                                    </div>
                                    <div class="stats-right">
                                        <label>90</label>
                                    </div>
                                    <div class="clearfix"> </div>	
                                </div>
                                <div class="col-md-3 widget states-mdl">
                                    <div class="stats-left">
                                        <h5>Hoy</h5>
                                        <h4>Ejercicios</h4>
                                    </div>
                                    <div class="stats-right">
                                        <label> 85</label>
                                    </div>
                                    <div class="clearfix"> </div>	
                                </div>
                                <div class="col-md-3 widget states-thrd">
                                    <div class="stats-left">
                                        <h5>Hoy</h5>
                                        <h4>Rutinas</h4>
                                    </div>
                                    <div class="stats-right">
                                        <label>51</label>
                                    </div>
                                    <div class="clearfix"> </div>	
                                </div>
                                <div class="col-md-3 widget states-last">
                                    <div class="stats-left">
                                        <h5>Hoy</h5>
                                        <h4>Metas</h4>
                                    </div>
                                    <div class="stats-right">
                                        <label>30</label>
                                    </div>
                                    <div class="clearfix"> </div>	
                                </div>
                                <div class="clearfix"> </div>	
                            </div>
                        </div>
                        <!--//custom-widgets-->
                        <!--/candile-->
                        <div class="candile"> 
                            <div class="candile-inner">
                                <h3 class="sub-tittle">Estadisticas de progreso </h3>
                                <div id="center"><div id="fig">
                                        <script type="text/javascript+protovis">

                                            /* Parse dates. */
                                            var dateFormat = pv.Format.date("%d-%b-%y");
                                            vix.forEach(function(d) d.date = dateFormat.parse(d.date));

                                            /* Scales. */
                                            var w =1220,
                                            h = 300,
                                            x = pv.Scale.linear(vix, function(d) d.date).range(0, w),
                                            y = pv.Scale.linear(vix, function(d) d.low, function(d) d.high).range(0, h).nice();

                                            var vis = new pv.Panel()
                                            .width(w)
                                            .height(h)
                                            .margin(10)
                                            .left(30);

                                            /* Dates. */
                                            vis.add(pv.Rule)
                                            .data(x.ticks())
                                            .left(x)
                                            .strokeStyle("#eee")
                                            .anchor("bottom").add(pv.Label)
                                            .text(x.tickFormat);

                                            /* Prices. */
                                            vis.add(pv.Rule)
                                            .data(y.ticks(7))
                                            .bottom(y)
                                            .left(-10)
                                            .right(-10)
                                            .strokeStyle(function(d) d % 10 ? "#ddd" : "#ddd")
                                            .anchor("left").add(pv.Label)
                                            .textStyle(function(d) d % 10 ? "#999" : "#ddd")
                                            .text(y.tickFormat);

                                            /* Candlestick. */
                                            vis.add(pv.Rule)
                                            .data(vix)
                                            .left(function(d) x(d.date))
                                            .bottom(function(d) y(Math.min(d.high, d.low)))
                                            .height(function(d) Math.abs(y(d.high) - y(d.low)))
                                            .strokeStyle(function(d) d.open < d.close ? "#052963" : "#00C6D7")
                                            .add(pv.Rule)
                                            .bottom(function(d) y(Math.min(d.open, d.close)))
                                            .height(function(d) Math.abs(y(d.open) - y(d.close)))
                                            .lineWidth(10);

                                            vis.render();

                                        </script>
                                        <script type="text/javascript" src="js/protovis-d3.2.js"></script>
                                        <script type="text/javascript" src="js/vix.js"></script>

                                    </div>
                                </div>

                            </div>

                        </div>
                        <!--/candile-->

                        <!--/charts-->
                        <div class="charts">
                            <div class="chrt-inner">
                                <div class="chrt-bars">
                                    <div class="col-md-6 chrt-two">
                                        <h3 class="sub-tittle">Ejercicios Realizados</h3>
                                        <div id="chart2"></div>
                                        <script src="js/fabochart.js"></script>
                                        <script>
                                            $(document).ready(function () {
                                                data = {
                                                    'Ene': 300,
                                                    'Feb': 200,
                                                    'Mar': 100,
                                                    'Abr': 500,
                                                    'May': 400,
                                                    'Jun': 200
                                                };

                                                $("#chart1").faBoChart({
                                                    time: 500,
                                                    animate: true,
                                                    instantAnimate: true,
                                                    straight: false,
                                                    data: data,
                                                    labelTextColor: "#002561",
                                                });
                                                $("#chart2").faBoChart({
                                                    time: 2500,
                                                    animate: true,
                                                    data: data,
                                                    straight: true,
                                                    labelTextColor: "#002561",
                                                });
                                            });
                                        </script>
                                    </div>
                                    <div class="col-md-6 chrt-three">
                                        <h3 class="sub-tittle">Progreso del mes</h3>
                                        <div id="chartdiv"></div>	
                                        <script>
                                            var chart = AmCharts.makeChart("chartdiv", {
                                                "type": "serial",
                                                "theme": "light",
                                                "dataProvider": [{
                                                        "year": 1,
                                                        "value": 11.5,
                                                        "error": 5
                                                    }, {
                                                        "year": 2,
                                                        "value": 26.2,
                                                        "error": 5
                                                    }, {
                                                        "year": 3,
                                                        "value": 30.1,
                                                        "error": 5
                                                    }, {
                                                        "year": 4,
                                                        "value": 29.5,
                                                        "error": 7
                                                    }, {
                                                        "year": 5,
                                                        "value": 24.6,
                                                        "error": 10
                                                    }],
                                                "balloon": {
                                                    "textAlign": "left"
                                                },
                                                "valueAxes": [{
                                                        "id": "v1",
                                                        "axisAlpha": 0
                                                    }],
                                                "startDuration": 1,
                                                "graphs": [{
                                                        "balloonText": "value:<b>[[value]]</b><br>error:<b>[[error]]</b>",
                                                        "bullet": "yError",
                                                        "bulletSize": 10,
                                                        "errorField": "error",
                                                        "lineThickness": 2,
                                                        "valueField": "value",
                                                        "bulletAxis": "v1",
                                                        "fillAlphas": 0
                                                    }, {
                                                        "bullet": "round",
                                                        "bulletBorderAlpha": 1,
                                                        "bulletBorderColor": "#FFFFFF",
                                                        "lineAlpha": 0,
                                                        "lineThickness": 2,
                                                        "showBalloon": false,
                                                        "valueField": "value"

                                                    }],
                                                "chartCursor": {
                                                    "cursorAlpha": 0,
                                                    "cursorPosition": "mouse",
                                                    "graphBulletSize": 1,
                                                    "zoomable": false
                                                },
                                                "categoryField": "year",
                                                "categoryAxis": {
                                                    "gridPosition": "start",
                                                    "axisAlpha": 0
                                                },
                                                "export": {
                                                    "enabled": true
                                                }
                                            });
                                        </script>


                                    </div>
                                    <div class="clearfix"> </div>
                                </div>										
                           </div>
                            <!--/charts-inner-->
                        </div>
                        <!--//outer-wp-->
                    </div>
                    <!--footer section start-->
                    
                    <!--footer section end-->
                </div>
            </div>
            <!--//content-inner-->
            <!--/sidebar-menu-->
            <!--Menu-->
            <%@ include file="menu.jsp" %>  
            <!--Fin Menu-->
            <div class="clearfix"></div>		
        </div>
        <script>
            var toggle = true;

            $(".sidebar-icon").click(function () {
                if (toggle)
                {
                    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
                    $("#menu span").css({"position": "absolute"});
                } else
                {
                    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
                    setTimeout(function () {
                        $("#menu span").css({"position": "relative"});
                    }, 400);
                }

                toggle = !toggle;
            });
        </script>
        <!--js -->
        <link rel="stylesheet" href="css/vroom.css">
        <script type="text/javascript" src="js/vroom.js"></script>
        <script type="text/javascript" src="js/TweenLite.min.js"></script>
        <script type="text/javascript" src="js/CSSPlugin.min.js"></script>
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>