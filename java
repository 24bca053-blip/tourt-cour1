/* Google Font */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:'Poppins',sans-serif;
    scroll-behavior:smooth;
}

body{
    background:#f5f5f5;
    color:#333;
}

/* Navigation */

header{
    position:fixed;
    width:100%;
    top:0;
    left:0;
    z-index:1000;
    background:#0b7a2d;
    box-shadow:0 2px 8px rgba(0,0,0,.2);
}

.navbar{
    width:90%;
    margin:auto;
    height:70px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    color:#fff;
    font-size:28px;
    font-weight:700;
}

.logo i{
    margin-right:8px;
}

.nav-links{
    display:flex;
    list-style:none;
}

.nav-links li{
    margin:0 15px;
}

.nav-links a{
    text-decoration:none;
    color:#fff;
    font-weight:500;
    transition:.3s;
}

.nav-links a:hover{
    color:#ffd700;
}

.book-btn{
    text-decoration:none;
    background:#ffd700;
    color:#222;
    padding:10px 22px;
    border-radius:30px;
    font-weight:600;
    transition:.3s;
}

.book-btn:hover{
    background:#fff;
}

/* Hero */

.hero{
    height:100vh;
    background:linear-gradient(rgba(0,0,0,.5),
    rgba(0,0,0,.5)),
    url("../images/hero.jpg") center/cover;
    display:flex;
    justify-content:center;
    align-items:center;
    text-align:center;
}

.hero-content{
    color:#fff;
}

.hero h1{
    font-size:60px;
    margin-bottom:20px;
}

.hero p{
    font-size:20px;
    margin-bottom:30px;
}

.hero-btn{
    display:inline-block;
    background:#0b7a2d;
    color:#fff;
    text-decoration:none;
    padding:15px 35px;
    border-radius:30px;
    font-size:18px;
    transition:.3s;
}

.hero-btn:hover{
    background:#ffd700;
    color:#222;
}

/* Section */

section{
    padding:90px 10%;
}

section h2{
    text-align:center;
    font-size:38px;
    color:#0b7a2d;
    margin-bottom:50px;
}

/* About */

.about-container{
    display:flex;
    align-items:center;
    gap:40px;
    flex-wrap:wrap;
}

.about-image{
    flex:1;
}

.about-image img{
    width:100%;
    border-radius:12px;
}

.about-text{
    flex:1;
}

.about-text h3{
    margin-bottom:20px;
    font-size:30px;
}

.about-text p{
    margin-bottom:15px;
    line-height:1.8;
}

/* Facilities */

.facility-container{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(220px,1fr));
    gap:25px;
}

.card{
    background:#fff;
    padding:30px;
    border-radius:12px;
    text-align:center;
    transition:.3s;
    box-shadow:0 5px 15px rgba(0,0,0,.1);
}

.card:hover{
    transform:translateY(-10px);
}

.card i{
    font-size:50px;
    color:#0b7a2d;
    margin-bottom:20px;
}

.card h3{
    margin-bottom:15px;
}

/* Pricing */

.price-container{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
    gap:30px;
}

.price-card{
    background:#fff;
    border-radius:15px;
    padding:35px;
    text-align:center;
    box-shadow:0 5px 15px rgba(0,0,0,.1);
    transition:.3s;
}

.price-card.active{
    background:#0b7a2d;
    color:#fff;
}

.price-card h1{
    margin:20px 0;
    font-size:45px;
}

.price-card ul{
    list-style:none;
    margin:20px 0;
}

.price-card ul li{
    padding:10px;
}

.price-card button{
    background:#ffd700;
    border:none;
    padding:12px 30px;
    border-radius:30px;
    cursor:pointer;
    font-weight:600;
    transition:.3s;
}

.price-card button:hover{
    background:#111;
    color:#fff;
}

/* Gallery */

.gallery-container{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(250px,1fr));
    gap:20px;
}

.gallery-container img{
    width:100%;
    height:220px;
    object-fit:cover;
    border-radius:10px;
    transition:.4s;
}

.gallery-container img:hover{
    transform:scale(1.05);
}

/* Contact */

.contact form{
    max-width:700px;
    margin:auto;
    display:flex;
    flex-direction:column;
}

.contact input,
.contact textarea{
    margin:10px 0;
    padding:15px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:16px;
}

.contact button{
    margin-top:15px;
    padding:15px;
    border:none;
    background:#0b7a2d;
    color:#fff;
    font-size:18px;
    border-radius:8px;
    cursor:pointer;
    transition:.3s;
}

.contact button:hover{
    background:#066221;
}

/* Footer */

footer{
    background:#0b7a2d;
    color:#fff;
    text-align:center;
    padding:30px;
}

footer h3{
    margin-bottom:10px;
}

.social{
    margin-top:20px;
}

.social i{
    margin:0 10px;
    font-size:24px;
    cursor:pointer;
    transition:.3s;
}

.social i:hover{
    color:#ffd700;
}

/* Responsive */

@media(max-width:768px){

    .navbar{
        flex-direction:column;
        height:auto;
        padding:15px 0;
    }

    .nav-links{
        flex-direction:column;
        text-align:center;
        margin:15px 0;
    }

    .nav-links li{
        margin:10px 0;
    }

    .hero h1{
        font-size:40px;
    }

    .hero p{
        font-size:16px;
    }

    .about-container{
        flex-direction:column;
    }

    section{
        padding:70px 20px;
    }
}
