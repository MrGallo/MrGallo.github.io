---
layout: default
---
<h3>Problem {{ page.number }}</h3>
<h1 class="post-title">{{ page.title }}</h1>
{{ page.content }}
{% if page.pbd %}
---

    {% include problem_footer.md %}
{% endif %}