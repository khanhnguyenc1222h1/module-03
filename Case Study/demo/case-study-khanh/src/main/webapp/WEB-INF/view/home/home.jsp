<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/04/2023
  Time: 9:29 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<head>
    <title>Home</title>
</head>
<body>

<header>
    <div class="header">
        <!--Navigation -->
        <nav>
            <ul class="header-nav">
                <li class="nav-link">
                    <a href="#about">About</a>
                </li>
                <li class="nav-link">
                    <a href="#portfolio">Portfolio</a>
                </li>
                <li class="nav-link">
                    <a href="#myblog">My Blog</a>
                </li>
                <li class="nav-link">
                    <a href="#contact">Contact Me</a>
                </li>
            </ul>
        </nav>
        <!-- End Navigation -->
        <img src="https://s19.postimg.cc/hqrib0d2b/Robo-7.png" alt="robot head" id="header-robot">
        <h1 class="header-title">VINTAGE</h1>
        <h3 class="header-title">Retro Style Portfolio</h3>
        <div class="slides
        how" id="slideshow">
            <a id="prev">‹</a>
            <img src="https://s19.postimg.cc/6eewt96yb/vintage1-2x.jpg" alt="" class="carousel">
            <img src="https://s19.postimg.cc/u5eabhwwj/vintage2-2x.jpg" alt="" class="carousel">
            <img src="https://s19.postimg.cc/4nvvrchkz/vintage3-2x.jpg" alt="" class="carousel">
            <img src="https://s19.postimg.cc/4zdc4ob1v/vintage4-2x.jpg" alt="" class="carousel">
            <a id="next">›</a>
            <span class="caption">Vintage Carousel</span>
            <span class="caption">Vintage Sound</span>
            <span class="caption">Life in Colors</span>
            <span class="caption">The programmer Place</span>
        </div>
    </div>
</header>
<!--End Header-->

<!--Main-->
<main>
    <!--About Section-->
    <section class="about" id="about">

        <h2>About Me</h2>
        <div class="about-box">
            <h3>Design</h3>
            <img src="https://s19.postimg.cc/jl4cscutf/robot1.png" alt="robot head" class="robot-head">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, accusamus hic. Amet, nulla, nihil voluptate
                perferendis laudantium possimus eius commodi qui repudiandae porro fuga beatae quam voluptas modi maxime.
                Rem.
            </p>
        </div>
        <div class="about-box">
            <h3>Program Languages</h3>
            <img src="https://s19.postimg.cc/g1if2ix8j/robot2.png" alt="robot head" class="robot-head">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, accusamus hic. Amet, nulla, nihil voluptate
                perferendis laudantium possimus eius commodi qui repudiandae porro fuga beatae quam voluptas modi maxime.
                Rem.
            </p>
        </div>
        <div class="about-box">
            <h3>Style</h3>
            <img src="https://s19.postimg.cc/4cefeloab/robot3.png" alt="robot head" class="robot-head">
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, accusamus hic. Amet, nulla, nihil voluptate
                perferendis laudantium possimus eius commodi qui repudiandae porro fuga beatae quam voluptas modi maxime.
                Rem.
            </p>
        </div>

    </section>
    <!--End About Section-->


    <!--Portfolio-->
    <section class="portfolio" id="portfolio">

        <h2>Portfolio</h2>
        <div class="portfolio-box">
            <img src="https://s19.postimg.cc/4cefemj5f/design2.png" alt="design">
            <span class="portfolio-caption">Graphic</span>
        </div>
        <div class="portfolio-box">
            <img src="https://s19.postimg.cc/vmzqmk1hv/website2.jpg" alt="website">
            <span class="portfolio-caption">Website</span>
        </div>

        <div class="portfolio-box">
            <img src="https://s19.postimg.cc/uxgya7vtf/app.jpg" alt="app">
            <span class="portfolio-caption">App</span>
        </div>
        <div class="portfolio-box">
            <img src="https://s19.postimg.cc/cunvj0feb/code2.jpg" alt="code">
            <span class="portfolio-caption">Codepen</span>
        </div>

    </section>
    <!-- End Portfolio-->

    <!--MY BLOG-->
    <section>
        <div id="myblog">
            <h2>My Blog</h2>
            <div class="blog-post">
                <img src="https://s19.postimg.cc/9b1xt7keb/ontheroad-2x.jpg" alt="cars" class="blog-post_images">
                <div class="blog-post_content">
                    <h3>On the Road</h3>
                    <span class="blog-post_date">
                            Thu Nov 01 2018 17:09:18
                        </span>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam officia veritatis esse quae. Molestias
                        eum nulla fugit, commodi a voluptates doloremque similique consequatur molestiae earum dicta
                        maxime perferendis reprehenderit ea dolor magni. Debitis labore illo vero aspernatur, doloremque
                        nulla error?</p>
                    <button class="blog-post_button">
                        Read More...
                    </button>
                </div>
            </div>
            <div class="blog-post">
                <img src="https://s19.postimg.cc/6tq6lyfxf/boxes.jpg" alt="boxes" class="blog-post_images">
                <div class="blog-post_content">
                    <h3>A box of memories</h3>
                    <span class="blog-post_date">
                            Sat Jul 28 2018 07:27:38
                        </span>

                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam officia veritatis esse quae. Molestias
                        eum nulla fugit, commodi a voluptates doloremque similique consequatur molestiae earum dicta
                        maxime perferendis reprehenderit ea dolor magni. Debitis labore illo vero aspernatur, doloremque
                        nulla error?</p>
                    <button class="blog-post_button">
                        Read More...
                    </button>
                </div>

            </div>
            <div class="blog-post">
                <img src="https://s19.postimg.cc/wciiyz777/books.jpg" alt="books" class="blog-post_images">
                <div class="blog-post_content">
                    <h3>Books I loved</h3>
                    <span class="blog-post_date">
                            Thu Dec 20 2018 11:15:53
                        </span>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam officia veritatis esse quae. Molestias
                        eum nulla fugit, commodi a voluptates doloremque similique consequatur molestiae earum dicta
                        maxime perferendis reprehenderit ea dolor magni. Debitis labore illo vero aspernatur, doloremque
                        nulla error?</p>
                    <button class="blog-post_button">
                        Read More...
                    </button>
                </div>
            </div>
        </div>

    </section>
    <!--End MY BLOG-->
</main>
<!--End Main-->

<!--Footer-->
<footer>
    <section class="contact" id="contact">

        <div class="contact-inner">
            <h2>Contact Me</h2>
            <span class="contact-subtitle">Ask a question!</span>
            <form id="contact-form">

                <label for="name">Name:</label>
                <input type="text" id="name" placeholder="Your name" class="contact-form_input">
                <label for="email">Email:</label>
                <input type="email" id="email" placeholder="Your email" class="contact-form_input" class="contact-form_input">
                <label for="subject">Subject:</label>
                <input type="text" id="subject" placeholder="Your title here" class="contact-form_input">
                <label for="message">Your Message:</label>
                <textarea name="message" rows="10" id="message">Write something here</textarea>
                <input type="submit" class="contact-form_submit">

            </form>
        </div>
        <div id="social-media">
            <h2>Social</h2>
            <div class="social-media_icons">
                <i class="fab fa-github-alt social-media_icon">
                    <a href="#" aria-label="github"></a>
                </i>
                <i class="fab fa-twitter social-media_icon">
                    <a href="#" aria-label="twitter"></a>
                </i>
                <i class="fab fa-google-plus-g social-media_icon">
                    <a href="#" aria-label="google plus"></a>
                </i>
                <i class="fab fa-facebook-f social-media_icon">
                    <a href="#" aria-label="facebook"></a>
                </i>
                <i class="fab fa-pinterest-p social-media_icon">
                    <a href="#" aria-label="pinterest"></a>
                </i>




            </div>
        </div>

    </section>
    <section class="credits">
        <p class="credits-section">Vintage Portfolio Template by <a href="https://github.com/starskynder" target="_blank">starskynder </a> </p>
        <p class="credits-section">Photos from <a href="https://unsplash.com/" target="_blank">Unsplash </a></p>
        <p class="credits-section" >Cliparts from <a href="https://openclipart.org/" target="_blank">Open Clipart</a></p>

    </section>
</footer>
</body>
</html>
