function getCurrentHash() {
  return window.location.hash;
}
document.addEventListener('DOMContentLoaded', function() {
  var currentHash = getCurrentHash();
  var navLinks = document.querySelectorAll('#navbar-all .nav-link');
  navLinks.forEach(function(link) {
    if (link.getAttribute('href') === currentHash) {
      link.classList.add('active');
    }
  });
});