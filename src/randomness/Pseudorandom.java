package randomness;

import java.util.Random;

// TODO: Write static wrappers for Pseudorandomness's functions

/**
 * Provides an easy way to access <code>Pseudorandomness</code> functions
 * without having to create a new instance each time.
 * @author Alonso del Arte
 */
public class Pseudorandom {

    private static final Random RANDOM = new Random();
//            = new Pseudorandomness(new RandomDotOrgAccess());

    // TODO: Finish going through list of 3,000 common English words from:
    // https://www.ef.edu/english-resources/english-vocabulary/top-3000-words/
    public static final String[] SOME_COMMON_ENGLISH_WORDS = {"abandon",
            "ability", "about", "above", "abroad", "absence", "absolute",
            "absolutely", "absorb", "academic", "accept", "access", "accident",
            "accompany", "accomplish", "according", "account", "accurate",
            "accuse", "achieve", "achievement", "acknowledge", "acquire",
            "across", "action", "active", "activist", "activity", "actor",
            "actress", "actual", "actually", "adapt", "addition", "additional",
            "address", "adequate", "adjust", "adjustment", "administration",
            "administrator", "admire", "admission", "admit", "adolescent",
            "adopt", "adult", "advance", "advanced", "advantage", "adventure",
            "advertising", "advice", "advise", "adviser", "advocate", "affair",
            "affect", "afford", "afraid", "African", "after", "afternoon",
            "again", "against", "agency", "agenda", "agent", "aggressive",
            "agree", "agreement", "agricultural", "ahead", "aircraft",
            "airline", "airport", "album", "alcohol", "alive", "alliance",
            "allow", "almost", "alone", "along", "already", "alter",
            "alternative", "although", "always", "amazing", "American", "among",
            "amount", "analysis", "analyst", "analyze", "ancient", "anger",
            "angle", "angry", "animal", "anniversary", "announce", "annual",
            "another", "answer", "anticipate", "anxiety", "anybody", "anymore",
            "anyone", "anything", "anyway", "anywhere", "apart", "apartment",
            "apparent", "apparently", "appeal", "appear", "appearance", "apple",
            "application", "apply", "appoint", "appointment", "appreciate",
            "approach", "appropriate", "approval", "approve", "approximately",
            "architect", "area", "argue", "argument", "arise", "armed",
            "around", "arrange", "arrangement", "arrest", "arrival", "arrive",
            "article", "artist", "artistic", "Asian", "aside", "asleep",
            "aspect", "assault", "assert", "assess", "assessment", "asset",
            "assign", "assignment", "assist", "assistance", "assistant",
            "associate", "association", "assume", "assumption", "assure",
            "athlete", "athletic", "atmosphere", "attach", "attack", "attempt",
            "attend", "attention", "attitude", "attorney", "attract",
            "attractive", "attribute", "audience", "author", "authority",
            "available", "average", "avoid", "award", "aware", "awareness",
            "awful", "background", "badly", "balance", "barely", "barrel",
            "barrier", "baseball", "basic", "basically", "basis", "basket",
            "basketball", "bathroom", "battery", "battle", "beach", "beautiful",
            "beauty", "because", "become", "bedroom", "before", "begin",
            "beginning", "behavior", "behind", "being", "belief", "believe",
            "belong", "below", "bench", "beneath", "benefit", "beside",
            "besides", "better", "between", "beyond", "Bible", "billion",
            "biological", "birth", "birthday", "black", "blade", "blame",
            "blanket", "blind", "block", "blood", "board", "bombing", "border",
            "borrow", "bother", "bottle", "bottom", "boundary", "boyfriend",
            "brain", "branch", "brand", "bread", "break", "breakfast", "breast",
            "breath", "breathe", "brick", "bridge", "brief", "briefly",
            "bright", "brilliant", "bring", "British", "broad", "broken",
            "brother", "brown", "brush", "budget", "build", "building",
            "bullet", "bunch", "burden", "business", "butter", "button",
            "buyer", "cabin", "cabinet", "cable", "calculate", "camera",
            "campaign", "campus", "Canadian", "cancer", "candidate",
            "capability", "capable", "capacity", "capital", "captain",
            "capture", "carbon", "career", "careful", "carefully", "carrier",
            "carry", "catch", "category", "Catholic", "cause", "ceiling",
            "celebrate", "celebration", "celebrity", "center", "central",
            "century", "ceremony", "certain", "certainly", "chain", "chair",
            "chairman", "challenge", "chamber", "champion", "championship",
            "chance", "change", "changing", "channel", "chapter", "character",
            "characteristic", "characterize", "charge", "charity", "chart",
            "chase", "cheap", "check", "cheek", "cheese", "chemical", "chest",
            "chicken", "chief", "child", "childhood", "Chinese", "chip",
            "chocolate", "choice", "cholesterol", "choose", "Christian",
            "Christmas", "church", "cigarette", "circle", "circumstance",
            "citizen", "civil", "civilian", "claim", "class", "classic",
            "classroom", "clean", "clear", "clearly", "client", "climate",
            "climb", "clinic", "clinical", "clock", "close", "closely",
            "closer", "clothes", "clothing", "cloud", "cluster", "coach",
            "coalition", "coast", "coffee", "cognitive", "collapse",
            "colleague", "collect", "collection", "collective", "college",
            "colonial", "color", "column", "combination", "combine", "comedy",
            "comfort", "comfortable", "command", "commander", "comment",
            "commercial", "commission", "commit", "commitment", "committee",
            "common", "communicate", "communication", "community", "company",
            "compare", "comparison", "compete", "competition", "competitive",
            "competitor", "complain", "complaint", "complete", "completely",
            "complex", "complicated", "component", "compose", "composition",
            "comprehensive", "computer", "concentrate", "concentration",
            "concept", "concern", "concerned", "concert", "conclude",
            "conclusion", "concrete", "condition", "conduct", "conference",
            "confidence", "confident", "confirm", "conflict", "confront",
            "confusion", "Congress", "congressional", "connect", "connection",
            "consciousness", "consensus", "consequence", "conservative",
            "consider", "considerable", "consideration", "consist",
            "consistent", "constant", "constantly", "constitute",
            "constitutional", "construct", "construction", "consultant",
            "consume", "consumer", "consumption", "contact", "contain",
            "container", "contemporary", "content", "contest", "context",
            "continue", "continued", "contract", "contrast", "contribute",
            "contribution", "control", "controversial", "controversy",
            "convention", "conventional", "conversation", "convert",
            "conviction", "convince", "cookie", "cooking", "cooperation",
            "corner", "corporate", "corporation", "correct", "correspondent",
            "cotton", "couch", "could", "council", "counselor", "count",
            "counter", "country", "county", "couple", "courage", "course",
            "court", "cousin", "cover", "coverage", "crack", "craft", "crash",
            "crazy", "cream", "create", "creation", "creative", "creature",
            "credit", "crime", "criminal", "crisis", "criteria", "critic",
            "critical", "criticism", "criticize", "cross", "crowd", "crucial",
            "cultural", "culture", "curious", "current", "currently",
            "curriculum", "custom", "customer", "cycle", "daily", "damage",
            "dance", "danger", "dangerous", "darkness", "daughter", "dealer",
            "death", "debate", "decade", "decide", "decision", "deck",
            "declare", "decline", "decrease", "deeply", "defeat", "defend",
            "defendant", "defense", "defensive", "deficit", "define",
            "definitely", "definition", "degree", "delay", "deliver",
            "delivery", "demand", "democracy", "Democrat", "democratic",
            "demonstrate", "demonstration", "department", "depend", "dependent",
            "depending", "depict", "depression", "depth", "deputy", "derive",
            "describe", "description", "desert", "deserve", "design",
            "designer", "desire", "desperate", "despite", "destroy",
            "destruction", "detail", "detailed", "detect", "determine",
            "develop", "developing", "development", "device", "devote",
            "dialogue", "differ", "difference", "different", "differently",
            "difficult", "difficulty", "digital", "dimension", "dining",
            "dinner", "direct", "direction", "directly", "director", "dirty",
            "disability", "disagree", "disappear", "disaster", "discipline",
            "discourse", "discover", "discovery", "discrimination", "discuss",
            "discussion", "disease", "dismiss", "disorder", "display",
            "dispute", "distance", "distant", "distinct", "distinction",
            "distinguish", "distribute", "distribution", "district", "diverse",
            "diversity", "divide", "division", "divorce", "doctor", "document",
            "domestic", "dominant", "dominate", "double", "doubt", "downtown",
            "dozen", "draft", "drama", "dramatic", "dramatically", "drawing",
            "dream", "dress", "drink", "drive", "driver", "during", "eager",
            "early", "earnings", "earth", "easily", "eastern", "economic",
            "economics", "economist", "economy", "edition", "editor", "educate",
            "education", "educational", "educator", "effect", "effective",
            "effectively", "efficiency", "efficient", "effort", "eight",
            "either", "elderly", "elect", "election", "electric", "electricity",
            "electronic", "element", "elementary", "eliminate", "elite",
            "elsewhere", "embrace", "emerge", "emergency", "emission",
            "emotion", "emotional", "emphasis", "emphasize", "employ",
            "employee", "employer", "employment", "empty", "enable",
            "encounter", "encourage", "enemy", "energy", "enforcement",
            "engage", "engine", "engineer", "engineering", "English", "enhance",
            "enjoy", "enormous", "enough", "ensure", "enter", "enterprise",
            "entertainment", "entire", "entirely", "entrance", "entry",
            "environment", "environmental", "episode", "equal", "equally",
            "equipment", "error", "escape", "especially", "essay", "essential",
            "essentially", "establish", "establishment", "estate", "estimate",
            "ethics", "ethnic", "European", "evaluate", "evaluation", "evening",
            "event", "eventually", "every", "everybody", "everyday", "everyone",
            "everything", "everywhere", "evidence", "evolution", "evolve",
            "exact", "exactly", "examination", "examine", "example", "exceed",
            "excellent", "except", "exception", "exchange", "exciting",
            "executive", "exercise", "exhibit", "exhibition", "exist",
            "existence", "existing", "expand", "expansion", "expect",
            "expectation", "expense", "expensive", "experience", "experiment",
            "expert", "explain", "explanation", "explode", "explore",
            "explosion", "expose", "exposure", "express", "expression",
            "extend", "extension", "extensive", "extent", "external", "extra",
            "extraordinary", "extreme", "extremely"};

    // TODO: Write tests for this
    public static int nextInt() {
        return 0;
    }

    // TODO: Change this to use external API through Pseudorandomness
    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    // TODO: Write tests for this
    public static String nextWord() {
        return "Not implemented yet";
    }

    public static CoinSide flipCoin() {
        if (RANDOM.nextInt() % 2 == 0) {
            return CoinSide.HEADS;
        } else {
            return CoinSide.TAILS;
        }
    }

}
