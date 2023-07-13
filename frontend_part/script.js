const button = document.querySelector('#button'),
    name = document.querySelector('.authorName'),
    password = document.querySelector('.authorPassword')



button.addEventListener('click', () => {
    alert('Приветсвую, ' + name.value)
});