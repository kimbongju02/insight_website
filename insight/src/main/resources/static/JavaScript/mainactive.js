document.getElementById('startup').addEventListener('click', function() {
      this.style.backgroundColor = '#73538E';
    });
    document.getElementById('game').addEventListener('click', function() {
      this.style.backgroundColor = '#644B9F';
    });
    document.getElementById('robot').addEventListener('click', function() {
      this.style.backgroundColor = '#513F9B';
    });
    document.getElementById('web').addEventListener('click', function() {
      this.style.backgroundColor = '#371F77';
});

var buttons = document.querySelectorAll('.department-button');
var divs = document.querySelectorAll('.startup, .game, .robot, .web');

buttons.forEach(function(button, index) {
  button.addEventListener('click', function() {
    buttons.forEach(function(otherButton) {
      if (otherButton !== button) {
        otherButton.style.backgroundColor = 'transparent';
      }
    });

    this.style.backgroundColor = getComputedStyle(this).getPropertyValue('background-color');
    divs.forEach(function(div) {
      div.style.display = 'none';
    });
    divs[index].style.display = 'block';
  });
});

