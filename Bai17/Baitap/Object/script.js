/**
 * Created by nhatnk on 4/26/17.
 */

 function Hero(image, top, left, size, speed){
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;
    this.speed = speed;
    this.status = "MoveRight";
  
    this.getHeroElement = function(){
      return '<img width="'+ this.size + '"' +
        ' height="'+ this.size + '"' +
        ' src="' + this.image +'"' +
        ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
    }
  
    this.moveRight = function(){
      this.left += this.speed;
      console.log('ok: ' + this.left);
    }
    this.moveBot = function(){
      this.top += this.speed;
      console.log('ok: ' + this.top);
    }
    this.moveLeft = function(){
      this.left -= this.speed;
      console.log('ok: ' + this.left);
    }
    this.moveTop = function(){
      this.top -= this.speed;
      console.log('ok: ' + this.top);
    }
  
  }
  
  var hero = new Hero('pikachu.png', 20, 30, 100,50);
  
  function start(){
    if (hero.status == "MoveRight") {
      if(hero.left < window.innerWidth - hero.size*2){
        hero.moveRight();
      } else {
        hero.status="MoveBot"
      }
    } else if (hero.status == "MoveBot") {
      if(hero.top < window.innerHeight - hero.size*2){
        hero.moveBot();
      } else {
        hero.status="MoveLeft"
      }
    } else if (hero.status == "MoveLeft") {
      if(hero.left > hero.size){
        hero.moveLeft();
      } else {
        hero.status="MoveTop"
      }
    } else if (hero.status =="MoveTop") {
      if(hero.top > hero.size){
        hero.moveTop();
      } else {
        hero.status="MoveRight"
      }
    }
    document.getElementById('game').innerHTML = hero.getHeroElement();
    setTimeout(start, 100)
  }
  
  start();