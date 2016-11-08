package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Online Polling</title>\n");
      out.write("        <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        </style>\n");
      out.write("        <link href=\"styles/main.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <header id=\"top\">\n");
      out.write("                <h1>ONLINE NATIONAL POLING SYSTEM<br>\n");
      out.write("                </h1>\n");
      out.write("                <nav id=\"mainnav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"voterlogin.jsp\">Login</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">Voter Registration</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <div id=\"hero\">\n");
      out.write("                <article>\n");
      out.write("                    <h2>Vote For A Better India</h2>\n");
      out.write("                    <p>Nobody can go back and start a new beginning, but anyone can start today and make a new ending.<br><br>?Elections belong to the people. It's their decision. If they decide to turn their back on the fire and burn their behinds, then they will just have to sit on their blisters.? \n");
      out.write("                        <br>? Abraham Lincoln</p>\n");
      out.write("                </article>\n");
      out.write("                <img src=\"images/vote.jpg\" alt=\"\" width=\"3840\"/></div>\n");
      out.write("            <article id=\"main\">\n");
      out.write("                <h2>History of Elections</h2>\n");
      out.write("                <p>Although elections were used in  ancient Athens, in Rome, and in the selection of popes and Holy Roman emperors,  the origins of elections in the contemporary world lie in the gradual emergence  of representative&nbsp;<a href=\"http://www.britannica.com/topic/government\">government</a>&nbsp;in  Europe and North America beginning in the 17th century. At that time, the  holistic notion of<a href=\"http://www.britannica.com/topic/representation-government\">representation</a>&nbsp;characteristic  of the Middle Ages was transformed into a more<a name=\"ref416848\"></a><a href=\"http://www.britannica.com/topic/individualism\">individualistic</a>&nbsp;conception,  one that made the individual the critical unit to be counted. For example, the  British&nbsp;<a href=\"http://www.britannica.com/topic/Parliament\">Parliament</a>&nbsp;was  no longer seen as representing estates, corporations, and vested interests but  was rather perceived as standing for actual human beings. The movement  abolishing the so-called &ldquo;<a name=\"ref416849\"></a><a href=\"http://www.britannica.com/topic/rotten-borough\">rotten boroughs</a>&rdquo;?electoral  districts of small population controlled by a single person or family?that  culminated in the Reform Act of 1832 (one of three major&nbsp;<a href=\"http://www.britannica.com/topic/Reform-Bill\">Reform Bills</a>&nbsp;in the  19th century in Britain that expanded the size of the electorate) was a direct  consequence of this individualistic conception of representation. Once  governments were believed to derive their powers from the&nbsp;<a href=\"http://www.britannica.com/topic/consent-political-philosophy-and-ethics\">consent</a>&nbsp;of  the governed and expected to seek that consent regularly, it remained to decide  precisely who was to be included among the governed whose consent was  necessary. Advocates of full&nbsp;<a href=\"http://www.britannica.com/topic/democracy\">democracy</a>&nbsp;favoured  the establishment of universal adult&nbsp;<a name=\"ref416850\"></a><a href=\"http://www.britannica.com/topic/suffrage\">suffrage</a>. Across western  Europe and North America, adult male&nbsp;<a href=\"http://www.britannica.com/topic/suffrage\">suffrage</a>&nbsp;was ensured  almost everywhere by 1920, though&nbsp;<a href=\"http://www.britannica.com/topic/woman-suffrage\">woman suffrage</a>&nbsp;was  not established until somewhat later (e.g., 1928 in Britain, 1944 in France,  1949 in Belgium, and 1971 in Switzerland).<br>\n");
      out.write("                    Although it is common to equate  representative&nbsp;<a href=\"http://www.britannica.com/topic/government\">government</a>&nbsp;and  elections with<a name=\"ref416851\"></a><a href=\"http://www.britannica.com/topic/democracy\">democracy</a>, and although  competitive elections under universal suffrage are one of democracy&rsquo;s defining  characteristics, universal suffrage is not a necessary condition of competitive  electoral politics. An electorate may be limited by formal legal  requirements?as was the case before universal adult suffrage?or it may be  limited by the failure of citizens to exercise their right to vote. In many  countries with free elections, large numbers of citizens do not cast ballots.  For example, in&nbsp;<a href=\"http://www.britannica.com/place/Switzerland\">Switzerland</a>and  the United States, fewer than half the electorate vote in most elections.  Although legal or self-imposed exclusion can dramatically affect public&nbsp;<a href=\"http://www.britannica.com/topic/policy-government\">policy</a>&nbsp;and  even undermine the legitimacy of a government, it does not preclude decision  making by election, provided that voters are given genuine alternatives among  which to choose.</p>\n");
      out.write("                <h1><strong>\n");
      out.write("                        <figure><img src=\"images/vote2.JPG\" width=\"400\" height=\"250\" alt=\"\"/>\n");
      out.write("                        </figure>\n");
      out.write("                    </strong>\n");
      out.write("                    <figure>\n");
      out.write("                    </figure>\n");
      out.write("                </h1>\n");
      out.write("                <figure>\n");
      out.write("                    <figcaption>\n");
      out.write("                        <strong>Women's suffragists parade in New York City in 1917, carrying placards </strong>\n");
      out.write("                        <strong><br>\n");
      out.write("                            with signatures of more than a million women.</strong>                  </figcaption>\n");
      out.write("                </figure>\n");
      out.write("                <p><br>\n");
      out.write("                    During the 18th century, access to  the political arena depended largely on membership in an&nbsp;<a href=\"http://www.britannica.com/topic/aristocracy\">aristocracy</a>, and  participation in elections was regulated mainly by local customs and  arrangements. Although both the American and French revolutions declared every  citizen formally equal to every other, the vote remained an instrument of&nbsp;<a href=\"http://www.britannica.com/topic/political-power\">political power</a>&nbsp;possessed  by very few.<br>\n");
      out.write("                    Even with the implementation of  universal suffrage, the ideal of &ldquo;one person, one vote&rdquo; was not achieved in all  countries. Systems of plural voting were maintained in some countries, giving  certain social groups an electoral advantage. For example, in the&nbsp;<a href=\"http://www.britannica.com/place/United-Kingdom\">United Kingdom</a>, university  graduates and owners of businesses in constituencies other than those in which  they lived could cast more than one&nbsp;<a href=\"http://www.britannica.com/topic/ballot\">ballot</a>&nbsp;until 1948.  Before World War I, both Austria and Prussia had three classes of weighted  votes that effectively kept electoral power in the hands of the upper social  strata. Until the passage of the Voting Rights Act in 1965 in the United  States, legal barriers and intimidation effectively barred most African  Americans?especially those in the South?from being able to cast ballots in  elections.<br>\n");
      out.write("                    During the 19th and 20th centuries,  the increased use of competitive mass elections in western Europe had the  purpose and effect of institutionalizing the diversity that had existed in the  countries of that region. However, mass elections had quite different purposes  and consequences under the&nbsp;<a name=\"ref416852\"></a><a href=\"http://www.britannica.com/topic/totalitarianism\">one-party</a>&nbsp;communist  regimes of eastern Europe and the Soviet Union during the period from the end  of World War II to 1989?90. Although these governments held elections, the  contests were not competitive, as voters usually had only the choice of voting  for or against the official candidate. Indeed, elections in these countries  were similar to the 19th-century Napoleonic&nbsp;<a href=\"http://www.britannica.com/topic/plebiscite\">plebiscites</a>, which were  intended to demonstrate the unity rather than the diversity of the people. Dissent  in eastern Europe could be registered by crossing out the name of the candidate  on the ballot, as several million citizens in the&nbsp;<a name=\"ref416853\"></a><a href=\"http://www.britannica.com/place/Soviet-Union\">Soviet Union</a>&nbsp;did in  each election before 1989; however, because secret voting did not exist in  these countries, this practice invited reprisals. Nonvoting was another form of  protest, especially as local communist activists were under extreme pressure to  achieve nearly a 100 percent turnout. Not all elections in eastern Europe  followed the Soviet model. For example, in&nbsp;<a name=\"ref416854\"></a><a href=\"http://www.britannica.com/place/Poland\">Poland</a>&nbsp;more names  appeared on the ballot than there were offices to fill, and some degree of  electoral choice was thus provided.<br>\n");
      out.write("                    In sub-Saharan&nbsp;<a name=\"ref763430\"></a><a href=\"http://www.britannica.com/place/Africa\">Africa</a>,  competitive elections based on universal suffrage were introduced in three  distinct periods. In the 1950s and &rsquo;60s, a number of countries held elections  following&nbsp;<a href=\"http://www.britannica.com/topic/decolonization\">decolonization</a>.  Although many of them reverted to authoritarian forms of rule, there were  exceptions (e.g., Botswana and Gambia). In the late 1970s, elections were  introduced in a smaller number of countries when some military dictatorships  were dissolved (e.g., in Ghana and Nigeria) and other countries in Southern  Africa underwent decolonization (e.g., Angola, Mozambique, and Zimbabwe).  Beginning in the early 1990s, the end of the Cold War and the reduction of  military and economic aid from developed countries brought about  democratization and competitive elections in more than a dozen African  countries, including Benin, Mali, South Africa, and Zambia.</p>\n");
      out.write("                <figure class=\"centered\">\n");
      out.write("                    <p class=\"centered\"><img src=\"images/vote1.jpg\" alt=\"\" width=\"402\" height=\"317\" class=\"centered\"/></p>\n");
      out.write("                    <figcaption>Voters outside the Town Hall in Delhi during polling in the Assembly elections in December 1934</figcaption></figure>\n");
      out.write("                <p>Competitive elections in&nbsp;<a name=\"ref763428\"></a><a href=\"http://www.britannica.com/place/Latin-America\">Latin America</a>&nbsp;also  were introduced in phases. In the century after 1828, for example, elections  were held in Argentina, Chile, Colombia, and Uruguay, though all but Chile  reverted to&nbsp;<a href=\"http://www.britannica.com/topic/authoritarianism\">authoritarianism</a>.  Additional countries held elections in the period dating roughly 1943 to 1962,  though again many did not retain democratic governments. Beginning in the mid  1970s, competitive elections were introduced gradually throughout most of Latin  America.<br>\n");
      out.write("                    In&nbsp;<a name=\"ref763429\"></a><a href=\"http://www.britannica.com/place/Asia\">Asia</a>, competitive  elections were held following the end of World War II, in many cases as a  result of decolonization (e.g., India, Indonesia, Malaysia, and the  Philippines), though once again the restoration of authoritarianism was  commonplace. Beginning in the 1970s, competitive elections were reintroduced in  a number of countries, including the Philippines and South Korea. With the  exception of Turkey and Israel, competitive elections in the Middle East are  rare.<br>\n");
      out.write("                    <a name=\"ref416855\"></a><a href=\"http://www.britannica.com/topic/authoritarianism\">Authoritarian</a>&nbsp;regimes  often have used elections as a way to achieve a degree of popular legitimacy.  Dictatorships may hold elections in cases where no substantive opposition is  remotely feasible (e.g., because opposition forces have been repressed) or when  economic factors favour the regime. Even when opposition parties are allowed to  participate, they may face intimidation by the government and its allies, which  thereby precludes the effective mobilization of potential supporters. In other  cases, a regime may postpone an election if there is a significant chance that  it will lose. In addition, it has been a common practice of authoritarian  regimes to intervene once balloting has begun by intimidating voters (e.g.,  through physical attacks) and by manipulating the count of votes that have been  freely cast.</p>\n");
      out.write("            </article>\n");
      out.write("            <aside id=\"sidebar\">\n");
      out.write("                <h2 id=\"firstHeading\" lang=\"en\">Elections in India                </h2>\n");
      out.write("                <p style=\"margin-top:6.0pt;margin-right:0cm;margin-bottom:6.0pt;margin-left:0cm;line-height:16.8pt;background:white;\" bgcolor=\"white\"><span style=\"font-family:'Arial',sans-serif; font-size:10.5pt; color:#252525; \">India has an asymmetric&nbsp;<a href=\"https://en.wikipedia.org/wiki/Federalism\" title=\"Federalism\"><span style=\"text-underline:none; color:#0B0080; text-decoration:none; \">federal  government</span></a>, with elected officials at the federal, state and local  levels. At the national level, the&nbsp;<a href=\"https://en.wikipedia.org/wiki/Head_of_government\" title=\"Head of government\"><span style=\"color:#0B0080; text-decoration:none; \">head of government</span></a>,&nbsp;<a href=\"https://en.wikipedia.org/wiki/Prime_Minister_of_India\" title=\"Prime Minister of India\"><span style=\"color:#0B0080; text-decoration:none; \">prime minister</span></a>, is elected by members of  the&nbsp;<a href=\"https://en.wikipedia.org/wiki/Lok_Sabha\" title=\"Lok Sabha\"><span style=\"color:#0B0080; text-decoration:none; \">Lok Sabha</span></a>,  the lower house of the parliament of India,&nbsp;The  elections are conducted by the&nbsp;<a href=\"https://en.wikipedia.org/wiki/Election_Commission_of_India\" title=\"Election Commission of India\"><span style=\"color:#0B0080; text-decoration:none; \">Election Commission of India</span></a>. All members  of the Lok Sabha, except two who can be nominated by the&nbsp;<a href=\"https://en.wikipedia.org/wiki/President_of_India\" title=\"President of India\"><span style=\"color:#0B0080; text-decoration:none; \">President of India</span></a>, are directly elected  through general elections which take place every five years, in normal  circumstances, by&nbsp;<a href=\"https://en.wikipedia.org/wiki/Universal_suffrage\" title=\"Universal suffrage\"><span style=\"color:#0B0080; text-decoration:none; \">universal adult suffrage</span></a> Members of the&nbsp;<a href=\"https://en.wikipedia.org/wiki/Rajya_Sabha\" title=\"Rajya Sabha\"><span style=\"color:#0B0080; text-decoration:none; \">Rajya Sabha</span></a>,  the upper house of the Indian parliament, are elected by elected members of the  legislative assemblies of the states and the Electoral college for the Union  Territories of India.</span><sup id=\"cite_ref-Rajya_Sabha_3-0\" style=\"unicode-bidi:-webkit-isolate;\"><span style=\"font-family:'Arial',sans-serif; font-size:8.5pt; color:#252525; \"><a href=\"https://en.wikipedia.org/wiki/Elections_in_India#cite_note-Rajya_Sabha-3\"><span style=\"color:#0B0080; text-decoration:none; \">[3]</span></a></span></sup><span style=\"font-family:'Arial',sans-serif; font-size:10.5pt; color:#252525; \"> </span></p>\n");
      out.write("                <p style=\"margin-top:6.0pt;margin-right:0cm;margin-bottom:6.0pt;margin-left:0cm;line-height:16.8pt;background:white;orphans:auto;text-align:start;widows:1;-webkit-text-stroke-width:0px;word-spacing:0px;\" bgcolor=\"white\"><span style=\"font-family:'Arial',sans-serif; font-size:10.5pt; color:#252525; \"><a href=\"https://en.wikipedia.org/wiki/Indian_general_election,_2014\" title=\"Indian general election, 2014\"><span style=\"color:#0B0080; text-decoration:none; \">2014 general elections</span></a>&nbsp;involved an electorate of 81.45 crore  people (larger than both EU and US elections combined). Declared expenditure  has trebled since 1989 to almost $300 million, using more than one million&nbsp;<a href=\"https://en.wikipedia.org/wiki/Indian_voting_machines\" title=\"Indian voting machines\"><span style=\"color:#0B0080; text-decoration:none; \">electronic voting machines</span></a>. The size of the  huge electorate mandates that elections be conducted in a number of phases  (there were nine phases in the 2014 general election). It involves a number of  step-by-step processes from announcement of election dates to the announcement  of results paving the way for the formation of the new government.</span></p>\n");
      out.write("                <p class=\"MsoNormal\">&nbsp;</p><p>&nbsp;</p>\n");
      out.write("            </aside>\n");
      out.write("            <footer>© Copyright 2013 HPES</footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
