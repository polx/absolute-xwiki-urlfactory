# absolute-xwiki-urlfactory
A tiny extension which allows to parametrize the host-name of any URL delivered by XWiki.

## Installation
This extension is in Java and nedds to be included in `WEB-INF/lib` of the XWiki web-application.  After that, three lines of configuration need to be inserted inside `xwiki.cfg`:
* `xwiki.urlfactory.serviceclass=net.hoplahup.absoluteurlfactory.AbsoluteURLFactoryServiceImpl`
* `net.hoplahup.absoluteurlfactory.baseURL=http://my-domain.net`
* `net.hoplahup.absoluteurlfactory.attachmentsBaseURL=http://my-domain.net`

Once these  three lines (without any leading star or bullet) are inside the configuration file. The XWiki should be restarted.

### Explanations
Simple installations can use the same value for the two URLs.

Elaborate installations, however,  may benefit to separate attachments and baseURL so as to leverage content-distribution-networks which allow to proxy requests and cache the results. This factory adds a revision number as parameter thus making sure that each version of the attachments have a different URLs. This has been successfully employed using Amazon CloudFront on Curriki.org.


## License
Apache Public License as per the [License](LICENSE.txt).

## Build
Make sure you have configured maven to include all sources necessary to build XWiki (see [How to build](http://dev.xwiki.org/xwiki/bin/view/Community/Building)).
Go to the directory of this project.
Invoke `mvn package`
The jar file that just appeared in the `target` directory is ready to be uploaded.
