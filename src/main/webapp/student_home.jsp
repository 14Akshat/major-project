<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

    <title>Responsive Animated Navbar with Slider</title>
    <link rel="stylesheet" href="css/student_home.css">
</head>
<body>
    <!-- Header Section -->
    <header>
        <nav>
            <div class="logo">
                <a href="#" class="logo-text">Placify</a>
            </div>
            <div class="hamburger">
                <div class="line1"></div>
                <div class="line2"></div>
                <div class="line3"></div>
            </div>
            <ul class="nav-links">
                <li><a href="#">Home</a></li>
                <li><a href="#">Solutions</a></li>
                <li><a href="#">Products</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><button class="login-button" href="#">Logout</button></li>
                
            </ul>
        </nav>
    </header>

               <!-- Banner Section with Slider -->
                       <!-- Banner Section with Fixed-Size Slider -->
                       <section class="banner">
                        <div id="bannerSlider" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img src="img/Student Images/homeimg3.jpg" class="d-block w-100 slider-img" alt="Slide 1">
                                    <div class="carousel-caption">
                                        <h5>Welcome to Placify</h5>
                                        <p>Enhancing your placement preparation experience.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="img/Student Images/homeimg2.jpg" class="d-block w-100 slider-img" alt="Slide 2">
                                    <div class="carousel-caption">
                                        <h5>Mock Tests & Evaluations</h5>
                                        <p>Track your progress with real-time assessments.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="img/Student Images/homeimg1.jpeg" class="d-block w-100 slider-img" alt="Slide 3">
                                    <div class="carousel-caption">
                                        <h5>Verified Resources</h5>
                                        <p>Access official placement resources directly from coordinators.</p>
                                    </div>
                                </div>
                            </div>
                            <a class="carousel-control-prev" href="#bannerSlider" role="button" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#bannerSlider" role="button" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Next</span>
                            </a>
                        </div>
                    </section>
                    
    <!-- Card Section -->
<!-- apply styling and text decoration none on p tag -->
<div class="container-fluid my-cards-section">
    <h2 class="text-center">Browse Topics</h2>
    <div class="row justify-content-center">
        <div class="col-md-3 my-card">
            <div class="card-content">
                <img src="img/Student Images/Information img.avif" alt="Twitter Image" class="card-img">
                <i class="fab fa-twitter fa-2x"></i>
                <h3>Information</h3>
                <p>Stay updated with the latest placement news and official announcements.</p>
            </div>
        </div>
        <div class="col-md-3 my-card">
            <div class="card-content">
                <a href="student_quiz.jsp">
                <img src="img/Student Images/box2.webp" alt="Image" class="card-img">
                <i class="fab fa-instagram fa-2x"></i>
                <h3>Quiz</h3>
                <p>Test your knowledge with real-time quizzes designed to prepare you for placements.</p>
            </a>
            </div>
        </div>
        <div class="col-md-3 my-card">
            <div class="card-content">
                <img src="img/Student Images/box3.jpg" alt="Youtube Image" class="card-img">
                <i class="fab fa-youtube fa-2x"></i>
                <h3>Check Progress</h3>
                <p>Track your preparation journey and see how you measure up against your goals.</p>
            </div>
        </div>
        <div class="col-md-3 my-card">
            <div class="card-content">
                <img src="img/Student Images/box4.avif" alt="Interview Prep" class="card-img">
                <i class="fab fa-paper-plane fa-2x"></i>
                <h3>Resources</h3>
                <p>Access a curated collection of study materials and previous year questions.</p>
            </div>
        </div>
        <!-- New Card 2 -->
        <div class="col-md-3 my-card">
            <div class="card-content">
                <a href="syllabus.jsp">
                <img src="img/Student Images/box5.jpg" alt="Interview Prep" class="card-img">
                <i class="fab fa-paper-plane fa-2x"></i>
                <h3>Syllabus</h3>
                <p>Review the complete syllabus to ensure you're on the right track for your exams and placements.</p>
            </a>
            </div>
        </div>
        
        
    </div>
</div>
<footer class="footer-20192">
    <div class="site-section">
    <div class="container">
    
    <div class="row">
    <div class="col-sm">
    <a href="#" class="footer-logo">Placify</a>
    <p class="copyright">
    <small>© 2019</small>
    </p>
    </div>
    <div class="col-sm">
    <h3>Customers</h3>
    <ul class="list-unstyled links">
    <li><a href="#">Buyer</a></li>
    <li><a href="#">Supplier</a></li>
    </ul>
    </div>
    <div class="col-sm">
    <h3>Company</h3>
    <ul class="list-unstyled links">
    <li><a href="#">About us</a></li>
    <li><a href="#">Careers</a></li>
    <li><a href="#">Contact us</a></li>
    </ul>
    </div>
    <div class="col-sm">
    <h3>Further Information</h3>
    <ul class="list-unstyled links">
    <li><a href="#">Terms &amp; Conditions</a></li>
    <li><a href="#">Privacy Policy</a></li>
    </ul>
    </div>
    <div class="col-md-3">
    <h3>Follow us</h3>
    <ul class="list-unstyled social">
    <li><a href="#"><span class="icon-facebook"></span></a></li>
    <li><a href="#"><span class="icon-twitter"></span></a></li>
    <li><a href="#"><span class="icon-linkedin"></span></a></li>
    <li><a href="#"><span class="icon-medium"></span></a></li>
    <li><a href="#"><span class="icon-paper-plane"></span></a></li>
    </ul>
    </div>
    </div>
    </div>
    </div>
    </footer>
<!-- Font Awesome for icons (Optional) -->
<script src="https://kit.fontawesome.com/a076d05399.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    <script src="js/student_home.js"></script>
</body>
</html>
