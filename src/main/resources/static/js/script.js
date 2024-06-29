$(document).ready(function () {
    $('#signUpBtn').on('click', function () {
        $('#signUpForm').show();
        $('#signInForm').hide();
        $('#form-title').text('Sign Up');
        $('#signUpBtn').addClass('active');
        $('#signInBtn').removeClass('active');
    });

    $('#signInBtn').on('click', function () {
        $('#signUpForm').hide();
        $('#signInForm').show();
        $('#form-title').text('Sign In');
        $('#signUpBtn').removeClass('active');
        $('#signInBtn').addClass('active');
    });
});
