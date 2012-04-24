graph [
directed 1
node [
name "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
label "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
label "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
label "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
label "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
label "de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
graphics
[hasFill 0
]
]
node [
name "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
"
label "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
"
graphics
[hasFill 0
]
]
edge [
source "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
target "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,51
InternalAccessesCount = ,00
NameResemblance = ,55
AfferentCoupling = 12,00
EfferentCoupling = ,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
target "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,51
NameResemblance = ,55
InternalAccessesCount = ,00
AfferentCoupling = 12,00
EfferentCoupling = ,00
InterfaceAccessesCount = ,00
DirectoryMapping = 1,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
target "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 2,00
DefaultMergeIndicatingMetric = ,55
TotalTypesCount = 4,00
Instability = ,67
Abstractness = ,50
SubsystemComponent = ,00
DMS = ,17
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,53
InternalAccessesCount = ,00
NameResemblance = ,40
AfferentCoupling = 2,00
EfferentCoupling = 4,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
target "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,55
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,51
InternalAccessesCount = ,00
NameResemblance = ,42
AfferentCoupling = 4,00
EfferentCoupling = ,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
target "de.upb.examples.reengineering.store.logic.CustomerSearch
de.upb.examples.reengineering.store.logic.ISearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,55
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,51
NameResemblance = ,42
InternalAccessesCount = ,00
AfferentCoupling = 4,00
EfferentCoupling = ,00
InterfaceAccessesCount = ,00
DirectoryMapping = 1,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
target "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
label "Coupling = 1,00
ExternalAccessesCount = 6,00
PackageMapping = 1,00
AbstractTypesCount = 2,00
DefaultMergeIndicatingMetric = ,48
TotalTypesCount = 4,00
Instability = ,00
Abstractness = ,50
SubsystemComponent = ,00
DMS = ,50
AdherenceToInterfaceCommunication = ,33
DefaultCompositionIndicatingMetric = ,61
InternalAccessesCount = 6,00
NameResemblance = ,56
AfferentCoupling = 6,00
EfferentCoupling = ,00
DirectoryMapping = 1,00
InterfaceAccessesCount = 2,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
target "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 2,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 4,00
Instability = ,00
Abstractness = ,50
SubsystemComponent = ,00
DMS = ,50
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,52
NameResemblance = ,56
InternalAccessesCount = ,00
AfferentCoupling = 6,00
EfferentCoupling = ,00
InterfaceAccessesCount = ,00
DirectoryMapping = 1,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
target "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,52
InternalAccessesCount = ,00
NameResemblance = ,61
AfferentCoupling = 12,00
EfferentCoupling = ,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProductSearch
"
target "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 3,00
Instability = ,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,67
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,52
NameResemblance = ,61
InternalAccessesCount = ,00
AfferentCoupling = 12,00
EfferentCoupling = ,00
InterfaceAccessesCount = ,00
DirectoryMapping = 1,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.logic.ISearch
de.upb.examples.reengineering.store.logic.ProducerSearch
"
target "de.upb.examples.reengineering.store.logic.PriceCalculator
de.upb.examples.reengineering.store.logic.ICalculator
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 2,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 4,00
Instability = ,67
Abstractness = ,50
SubsystemComponent = ,00
DMS = ,17
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,53
InternalAccessesCount = ,00
NameResemblance = ,53
AfferentCoupling = 2,00
EfferentCoupling = 4,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
target "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
"
label "Coupling = ,00
ExternalAccessesCount = ,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,56
TotalTypesCount = 3,00
Instability = 1,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,33
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,53
InternalAccessesCount = ,00
NameResemblance = ,67
AfferentCoupling = ,00
EfferentCoupling = 6,00
DirectoryMapping = 1,00
InterfaceAccessesCount = ,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
edge [
source "de.upb.examples.reengineering.store.ui.IListView
de.upb.examples.reengineering.store.ui.ProductsListView
"
target "de.upb.examples.reengineering.store.ui.ProductsListViewEntry
"
label "Coupling = ,33
ExternalAccessesCount = 9,00
PackageMapping = 1,00
AbstractTypesCount = 1,00
DefaultMergeIndicatingMetric = ,67
TotalTypesCount = 3,00
Instability = 1,00
Abstractness = ,33
SubsystemComponent = ,00
DMS = ,33
AdherenceToInterfaceCommunication = ,00
DefaultCompositionIndicatingMetric = ,58
NameResemblance = ,67
InternalAccessesCount = 3,00
AfferentCoupling = ,00
EfferentCoupling = 6,00
InterfaceAccessesCount = ,00
DirectoryMapping = 1,00
SliceLayerArchitectureQuality = 1,00
"
graphics
[
targetArrow "standard"
]
]
]
