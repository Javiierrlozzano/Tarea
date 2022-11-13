<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Help Desk</title>
     <link href="{{asset('../resources/vendor/fontawesome-free/css/all.min.css')}}" rel="stylesheet" type="text/css">
       <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="{{asset('../resources/css/sb-admin-2.min.css')}}" rel="stylesheet">
  

</head>

<body id="page-top">
<script type="text/javascript" >
    
    function getEquipos(equipo) {
            var Detalle =document.getElementById("Estado");
            Detalle.value=1;
        }
      
function Garantia() {
    alert("Pruebas");
}
 
    </script>
    <!-- Page Wrapper -->
    <div id="wrapper">
					@guest
                            @if (Route::has('login'))
                              
                            @endif

                            @if (Route::has('register'))

                            @endif
                        @else
                     
		
        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                    <div class="sidebar-brand-text mx-3">Help Desk <sup>1.0</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="{{ route('tickes.index') }}">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>Tickes</span></a>
            </li>
            @if (Auth::user()->users_areas===1 )
            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Interface
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-cog"></i>
                    <span>Componentes</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Componentes:</h6>
                        <a class="collapse-item" href="{{ route('sedes.index') }}">Sedes</a>
                        <a class="collapse-item" href="{{ route('areas.index') }}">Areas</a>
                        <a class="collapse-item" href="{{ route('medios.index') }}">Medios</a>
                       
                    </div>
                </div>
            </li>

            <!-- Nav Item - Utilities Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                    <i class="fas fa-fw fa-wrench"></i>
                    <span>Utilidades</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Utilidades:</h6>
                        <a class="collapse-item" href="{{ route('windows.index') }}">Windows</a>
                        <a class="collapse-item" href="{{ route('marcas.index') }}">Marca</a>
                        <a class="collapse-item" href="{{ route('tipo-equipos.index') }}">Tipo Equipo</a>
                        <a class="collapse-item" href="{{ route('detalle-equipos.index') }}">Equipo</a>
                    </div>
                </div>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                Addons
            </div>

            

            <!-- Nav Item - Charts -->
            <li class="nav-item">
                <a class="nav-link" href="charts.html">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>Almacen</span></a>
            </li>
            <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    TIckes Asignados
                </div>



            <!-- Nav Item - Charts -->
            <li class="nav-item">
                <a class="nav-link" href="{{asset('estadistica')}}">
                    <i class="fas fa-fw fa-chart-area"></i>
                    <span>Listado Tickes</span></a>
            </li>


            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">
            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>
            @endif
            <!-- Sidebar Message -->
        </ul>
     
     
	 
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                    <ul class="navbar-nav ml-auto">
                   
                       <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small">
								{{ Auth::user()->name }}
								</span>
                                <img class="img-profile rounded-circle"
                                    src="{{asset('../resources/img/undraw_profile.svg')}}"> 
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="{{ route('logout') }}"
                                       onclick="event.preventDefault();
                                                     document.getElementById('logout-form').submit();">
                                        {{ __('Cerrar Sesion') }}
                                    </a>

                                    <form id="logout-form" action="{{ route('logout') }}" method="POST" class="d-none">
                                        @csrf
                                    </form>
                            </div>
                        </li>
   @endguest
                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">
    @yield('content')
                </div>
            
            </div>
          </div>
      </div>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    

    <!-- Bootstrap core JavaScript-->
    <script src="{{asset('../resources/vendor/jquery/jquery.min.js')}}"></script>
    <script src="{{asset('../resources/vendor/bootstrap/js/bootstrap.bundle.min.js')}}"></script>
    
     <!-- Core plugin JavaS../cript-->
     <script src="{{asset('../resources/vendor/jquery-easing/jquery.easing.min.js')}}"></script>
    
     <!-- Custom scripts fo../pages-->
     <script src="{{asset('../resources/js/sb-admin-2.min.js')}}"></script>
    
     <!-- Page level plugin../-->
     <script src="{{asset('../resources/vendor/chart.js/Chart.min.js')}}"></script>
    
    <!-- Page level custom../ts -->
    <script src="{{asset('../resources/js/demo/chart-area-demo.js')}}"></script>
    <script src="{{asset('../resources/js/demo/chart-pie-demo.js')}}"></script>



 



</body>

</html>