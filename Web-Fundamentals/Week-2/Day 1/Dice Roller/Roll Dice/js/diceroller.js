<script>
    var store;
    var randomnum;
    function diceclick(){
        randomnum = Math.floor(Math.random() * 6) + 1;
    store = document.getElementById("roll");
    store.innerHTML = randomnum;
    if(randomnum==1){
        document.getElementById("diceimg").src = "one.png"
    }
    if(randomnum==2){
        document.getElementById("diceimg").src = "two.png"
    }
    if(randomnum==3){
        document.getElementById("diceimg").src = "three.png"
    }
    if(randomnum==4){
        document.getElementById("diceimg").src = "four.png"
    }
    if(randomnum==5){
        document.getElementById("diceimg").src = "five.png"
    }
    if(randomnum==6){
        document.getElementById("diceimg").src = "six.png"
    }
}
</script>