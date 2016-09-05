package net.hoplahup.absoluteurlfactory;


import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWiki;
import com.xpn.xwiki.web.XWikiURLFactoryServiceImpl;

public class AbsoluteURLFactoryServiceImpl extends XWikiURLFactoryServiceImpl {

    public AbsoluteURLFactoryServiceImpl(XWiki xwiki) {
        super(xwiki);
        register(xwiki, XWikiContext.MODE_SERVLET, AbsoluteURLFactory.class, "xwiki.urlfactory.servletclass");
    }

}
