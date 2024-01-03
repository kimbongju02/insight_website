'use strict';
 
var singleUploadForm = document.querySelector('#singleUploadForm');
var singleFileUploadInput = document.querySelector('#singleFileUploadInput');
var singleFileUploadError = document.querySelector('#singleFileUploadError');
var singleFileUploadSuccess = document.querySelector('#singleFileUploadSuccess');
 
function uploadSingleFile(file) {
    var formData = new FormData();
    formData.append("file", file);
 
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/fileUpload");
    
    console.log(formData);
 
    xhr.send(formData);
}
 
singleUploadForm.addEventListener('submit', function(event){
    var files = singleFileUploadInput.files;
    if(files.length === 0) {
        singleFileUploadError.innerHTML = "Please select a file";
        singleFileUploadError.style.display = "block";
    }
    uploadSingleFile(files[0]);
    event.preventDefault();
}, true);