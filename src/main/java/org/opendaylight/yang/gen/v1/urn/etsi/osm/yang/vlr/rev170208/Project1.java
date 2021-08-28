package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.VlrCatalog;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Project1
    extends
    Augmentation<Project>
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.Project1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.Project1.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.VlrCatalog</code> <code>vlrCatalog</code>, or <code>null</code> if not present
     */
    @Nullable VlrCatalog getVlrCatalog();

}

