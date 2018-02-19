<hr>
{% assign previous = page.previous %}
{% if previous %}
  <a href="{{ previous.permalink }}" style="float:left;">&#9668; {{ previous.id | remove: '/problems/' | plus: 0 }}: {{ previous.title }}</a>
{% endif %}

{% assign next = page.next %}
{% if next %}
  <a href="{{ next.permalink }}" style="float:right;">{{ next.id | remove: '/problems/' | plus: 0 }}: {{ next.title }} &#9658;</a>
{% endif %}
<br><br>